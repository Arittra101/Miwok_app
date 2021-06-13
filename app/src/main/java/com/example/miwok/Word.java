package com.example.miwok;

public class Word {

        private String  name;
        private String  id;

        public Word(String name,String id)
        {
            this.name =  name;
            this.id =  id;
        }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }
}
