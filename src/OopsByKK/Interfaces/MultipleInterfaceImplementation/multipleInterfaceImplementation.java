package OopsByKK.Interfaces.MultipleInterfaceImplementation;

// multiple interface implementation(java's alternative to multiple inheritance)
interface printable{

    void print();



}


interface showable{
    void show();


}


class Documents implements printable,showable{



    public void print(){
        System.out.println(" printing document ");
    }

    public void show(){
        System.out.println(" showing document ");
    }

}

class main{

    public static void main(String[] args) {

        Documents doc = new Documents();

        doc.print(); // Output: printing document
        doc.show();  // Output: showing document




    }
}

