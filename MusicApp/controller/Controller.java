package controller;

import static staticvariables.StaticVariables.controllerInstance;

import exceptions.InvalidCommandException;

public class Controller {
	private Controller(){}

    public static Controller getControllerInstance()
    {
        if(controllerInstance == null)
            controllerInstance = new Controller();
        return controllerInstance;
    }
    public void start()
    {
    	//baci bolor@
    }
    public void showMusicList()
    {
    	
    }
    public void showArtistList()
    {
    	
    }
    public void inputValidation(String enterType) throws InvalidCommandException
    {
    	//ete music gri playlist beri
    	//ete artist artist list
    	//delete ev ayln addres booki nman switch ogtagorcenk
    }
    public void start()
    {
    	//input validat skizb
    }
    public void exit()
    {
    	//durs kga 
    }
}
