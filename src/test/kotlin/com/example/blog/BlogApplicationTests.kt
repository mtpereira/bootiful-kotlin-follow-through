package com.example.blog

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class BlogApplicationTests {

    @BeforeAll
    fun before() {

    }

    @Test
    fun contextLoads() {
    }

    @AfterAll
    fun after() {

    }

}
