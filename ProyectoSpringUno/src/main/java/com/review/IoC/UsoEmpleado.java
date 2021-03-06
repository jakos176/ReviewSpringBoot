package com.review.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

		public static void main(String[] args) {
			
			/*Without the use of beans, it would be necessary to modify 
			 the code every time you want to change who executes the task.
			Empleados empleado1 = new JefeEmpleado();
			System.out.println(empleado1.getTareas());*/
			
			
			/*With the use of beans, you only need to modify
			 the xml file if you want to modify who executes the task.*/
			ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
			DirectorEmpleado Juan = context.getBean("miEmpleado", DirectorEmpleado.class);
			System.out.println(Juan.getTareas());
			System.out.println(Juan.getInformes());
			System.out.println(Juan.getEmail());
			System.out.println(Juan.getNombreEmpresa());
					
			/*SecretarioEmpleado maria = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
			System.out.println(maria.getTareas());
			System.out.println(maria.getInformes());
			System.out.println(maria.getEmail());
			System.out.println(maria.getNombreEmpresa());*/
			
			context.close();
			
			/*To change who executes the task, go to the applicattionContext.xml file and change the 
			beans of  "miEmpleado"to the object you want to execute the task. Example

			bean id="miEmpleado" class="com.review.IoC.Empleados.JefeEmpleado"*/

		}
}
