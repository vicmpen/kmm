package gr.vic.testconf

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}