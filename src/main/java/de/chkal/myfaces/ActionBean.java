package de.chkal.myfaces;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class ActionBean
{

    private final List<Item> items;
    
    public ActionBean()
    {
        items = Arrays.asList(
                new Item("Item1"),
                new Item("Item2"),
                new Item("Item3")
        );
    }
    
    public String selectItem(Item selectedItem) {

        System.out.println("Your selected item is: "+selectedItem);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("Your selected item is: "+selectedItem));
        return null;
        
    }
    
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

    public List<Item> getItems()
    {
        return items;
    }

    
}
