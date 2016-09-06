package staticvariables;

import static controller.Controller.getControllerInstance;

import controller.Controller;

public class StaticVariables {
    public static Controller controllerInstance = getControllerInstance();
}
