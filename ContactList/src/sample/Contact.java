package sample;

public class Contact {
    String first;
    String last;
    String phone;
    String address;
    String notes;


    Contact(String first, String last, String phone, String address, String notes){
       this.first = first;
       this.last = last;
       this.phone = phone;
       this.address = address;
       this.notes = notes;
    }



    public String toString(){
        return first +" "+ last;
    }

    //Getters and Setters
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
