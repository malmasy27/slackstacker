package uk.co.azquelt.slackstacker.stack;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {

	public String question_id;
	
	public String link;
	
	public String title;
	
	@JsonDeserialize(using=StackDateDeserializer.class)
	public Calendar creation_date;
	
	@JsonDeserialize(using=StackDateDeserializer.class)
	public Calendar last_activity_date;
}
