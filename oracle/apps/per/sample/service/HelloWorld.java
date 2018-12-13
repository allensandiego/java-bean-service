package oracle.apps.per.sample.service;

/**
 * A sample class to demonstrate how Java API can use the ISG REST framework. This class provides
 * methods to return string Hello World
 * @rep:scope public
 * @rep:product PER
 * @rep:displayname Hello World
 * @rep:category BUSINESS_ENTITY HR_USER_HOOK
 * @rep:category IREP_CLASS_SUBTYPE JAVA_BEAN_SERVICES
 */
public class HelloWorld {

    public HelloWorld() {
    }
    
    /**
     * 
     * This method returns a list of direct reports of the requesting user.
     *
     * @return Hello World string
     * @rep:paraminfo {rep:precision 80}
     * @rep:scope public
     * @rep:displayname Get Hello World
     * @rep:httpverb get
     */
    public String getHelloWorld() {
        return "Hello World";
    }
        
}
