package webpipipi;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class MyBean {


	private List<String> messages = new ArrayList<String>();



	public MyBean() {

		super();
		messages.add("beansample1");

	}


	public void addMessage(String message) {

		System.out.println(message);

		messages.add(message);

	}

	public String getMessage(int n) {
		System.out.println("n = " + n);
		return messages.get(n);

	}


	public void setMessage(int n,String message) {

		messages.set(n,message);
		System.out.println("MyBean SetMessage入る");
	}


	public List<String> getMessages(){

		return messages;

	}

	public void setMessages(List<String> messages) {

		this.messages = messages;

	}


	@Override
	public String toString(){

		String result = "私のビーン";

		for(String message : messages) {

			result += "\t'" +  message + "'\n";

		}

			result += "]";
			return result;

	}


}
