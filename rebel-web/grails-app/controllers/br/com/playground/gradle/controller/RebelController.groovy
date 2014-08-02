package br.com.playground.gradle.controller

import br.com.playground.gradle.PlagroundLang

/**
 * <pre>
 * User: rfh
 * Date: 8/2/14
 *
 * </pre>
 */
class RebelController {

    def index(){
        render PlagroundLang.sayHello()
    }
}
