package de.chkal.myfaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class ActionBean
{
    
    public String tellYourName(String name) {
        
        System.out.println("Your name is: "+name);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("Your name is: "+name));
        return null;
    }

    public String tellYourAge(Long age) {
        
        System.out.println("Your age is: "+age);
        if(age != null) {
            System.out.println("That's twice as much as : "+age/2.0);
        }
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("Your age is: "+age));
        return null;
    }

    
}
