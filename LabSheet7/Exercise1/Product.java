package LabSheet7.Exercise1;
/* Product.java
 * By: Faun Schutz
 * Start: 13/09/2020
 * Finish: 13/09/2020
 *
 * A simple instantiable class definition for a Product. */

public class Product {
        private int id;
        private String name;
        private String description;
        private static int count = 1000000;

        public Product(String name, String description) {
            setId(id);
            setName(name);
            setDescription(description);
            incrementCount();
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = count+1;
        }
        private static void incrementCount(){
            count++;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public String toString() {
            return "Product details are as follows: id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
        }
}

