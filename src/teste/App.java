package teste;

import java.io.StringWriter;
import java.util.ArrayList;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class App {

	public static void main(String[] args) {
		
        VelocityEngine ve = new VelocityEngine();  
        ve.init();
  
        VelocityContext context = new VelocityContext();  
  
        Template t = ve.getTemplate("//src/teste/modelo.vm");  
      
        ArrayList<String> list = new ArrayList<String>();  
        list.add("Item 1");  
        list.add("Item 2");  
        list.add("Item 3");  
        list.add("Item 4");  
        list.add("Item 5");  
  
        context.put("lista", list);   
        StringWriter writer = new StringWriter();  
  
        t.merge(context, writer);  
  
        System.out.println(writer.toString());  
        
	}
	
}
