package com.example.recycleevening1;

public class Model {

        private int image;
        String name;
        String category;


        public Model(int image, String name, String category) {
            this.image = image;
            this.name = name;
            this.category = category;

        }

        public int getImage() {
            return image;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }


    }


