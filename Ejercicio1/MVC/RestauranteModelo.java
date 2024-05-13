package Ejercicio1.MVC;

public class RestauranteModelo {
        private String nombre;
        private String menu;

        public RestauranteModelo(String nombre, String menu){
            this.nombre = nombre;
            this.menu = menu;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getMenu(){
            return menu;
        }

        public void setMenu(String menu){
            this.menu = menu;
        }




}
