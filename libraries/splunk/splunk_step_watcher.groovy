@BeforeStep
void before(context){
    println "Splunk: running before the ${context.library} library's"
}

@AfterStep
void after(context){
    println "Splunk: running after the ${context.library} library's"
}