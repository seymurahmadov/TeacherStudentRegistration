package serviceMenu.inter;

import bean.Config;

public  interface MenuService {
     public default void process(){
          processAbstract();
          Config.save();
     }

     public abstract void processAbstract();
}
