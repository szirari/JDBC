package dom.exemple;

import java.util.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class DOMParserDemo {
	public static void main(String[] args) throws Exception {

	    //Get the DOM Builder Factory
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	    //Get the DOM Builder
	    DocumentBuilder builder = factory.newDocumentBuilder();

	    //Load and Parse the XML document
	    //document contains the complete XML as a Tree.
	    Document document = builder.parse(ClassLoader.getSystemResourceAsStream("employee.xml"));

	    List<Employee> empList = new ArrayList<>();

	    //Iterating through the nodes and extracting the data.
	    NodeList nodeList = document.getDocumentElement().getChildNodes();

	    for (int i = 0; i < nodeList.getLength(); i++) {

	      //We have encountered an <employee> tag.
	      Node node = nodeList.item(i);

	      if (node instanceof Element) {
	        Employee emp = new Employee();
	        emp.id = node.getAttributes().getNamedItem("id").getNodeValue();

	        NodeList childNodes = node.getChildNodes();
	        for (int j = 0; j < childNodes.getLength(); j++) {
	          Node cNode = childNodes.item(j);

	          //Identifying the child tag of employee encountered. 
	          if (cNode instanceof Element) {
	            String content = cNode.getLastChild().getTextContent().trim();

	            switch (cNode.getNodeName()) {
	              case "firstName":
	                emp.setFirstName(content);
	                break;
	              case "lastName":
	                emp.setLastName(content);
	                break;
	              case "location":
	                emp.setLocation(content);
	                break;
	            }
	          }
	        }
	        empList.add(emp);
	      }

	    }

	    //Printing the Employee list populated.
	    for (Employee emp : empList) {
	      System.out.println(emp);
	    }

	  }

}
