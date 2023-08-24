package com.dakr.controller



import com.dakr.model.User
import com.dakr.repository.UserRepository

import lombok.AllArgsConstructor
import lombok.Data
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Id

@Data
@AllArgsConstructor
@RestController
class UserController(private val userRepository: UserRepository) {


   /* //for retrive all data
 @GetMapping("/retriveAll")
fun getUser():List<User>{
    return userRepository.findAll()
}*/

    //for retrive all
    @GetMapping("/retriveAll")
    fun getUser():ResponseEntity<List<User>>{
        return ResponseEntity.ok(this.userRepository.findAll())
    }

    //for retrive data by using Id
    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Int):ResponseEntity<User>{
        return ResponseEntity.ok(this.userRepository.findById(id).orElse(null))
    }

    // for insert data
   @PostMapping("/save")
    fun setUser(@RequestBody user: User):ResponseEntity<User>{
        return ResponseEntity.ok(this.userRepository.save(user))
    }

    //for update data
    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Int ,@RequestBody user: User):ResponseEntity<User>{
       var oldUser=this.userRepository.findById(id).orElse(null)

        oldUser.name=user.name
        oldUser.email=user.email
        oldUser.password=user.password

       return ResponseEntity.ok(this.userRepository.save(oldUser))
    }

    //for delete data
   @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Int):ResponseEntity<String>{
        this.userRepository.deleteById(id)
        return  ResponseEntity.ok("$id deleted successfully...")
    }
}