package com.example.paymentservice2.payment.adapter.`in`.web.view

import com.example.paymentservice2.common.WebAdapter
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono

@WebAdapter
@Controller
class CheckoutController {

    @GetMapping("/")
    fun checkoutPage(): Mono<String> {
        return Mono.just("checkout")
    }
}