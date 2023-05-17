## Expression Language in JSP

### Why Shouldn’t use Scriptlets and JSP Expression in JSP?
#

• The intention of JSP: Designed for the presentation layer as View.

• Help web designers to understand the code.

![image](https://github.com/PD-Repo-Point/jsp-el-Demo/assets/104901724/002327b3-7575-4606-9ea2-27fbc673ebe2)

### Expression Language in JSP
#

• Simplifies the accessibility of data stored in the Java Bean component, and other 
objects like request, session, application etc. 

• There are many implicit objects, operators and reserve words 

• Added in JSP technology version 2.0. 

• Syntax for Expression Language (EL) 
  ${ expression }
  

### EL Property Access Operator or Dot (.) Operator
#

•${firstObj.secondObj} 

• “firstObj” can be 

• EL implicit objects, normally implicit objects return a map 

• then “secondObj” is the key of the map 

• ${ param.name }  

• An attribute in page, request, session and application scope 

• then “secondObj” is a property of the bean 

• ${emp.firstName}


### Expression Language - Expression
#

•${something} 

• Container evaluates this as follows: 

1. Checks page scope for an attribute named “something”, if found, use it 
2. Otherwise checks request scope for an attribute named “something”, if found, use 
it 
3. Otherwise checks session scope for an attribute named “something”, if found, use it 
4. Otherwise checks application scope for an attribute named “something”, if found 
use it 
5. Otherwise ignore this expression

### JSP EL [] Operator or Collection Access Operator
#

• ${firstObj[secondObj]} 

• Can be used as dot operator 

• Can be used to get data from List and Array too 

• if “firstObj” is a List, “secondObj” is an index into the List 

• ${myList[1]} and ${myList[“1”]} the same 

• When attribute names have dots, cannot use dot operator, use [] operator 
instead 

•${requestScope[“foo.bar”]}



**To ignore the EL expression on the page context:**

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true"%> 



