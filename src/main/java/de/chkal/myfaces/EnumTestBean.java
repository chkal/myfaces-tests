package de.chkal.myfaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class EnumTestBean {
  
  public enum Level {
    HIGH, MEDIUM, LOW
  }
  
  private Level level;
  
  public String action() {

    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Success! Got level: "+level));
    return null;
    
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

}
