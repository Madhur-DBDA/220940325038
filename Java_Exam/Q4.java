class GrandParent
{
    String grandFatherName;
    String grandMotherName;
    GrandParent(String grandFather, String grandMother)
    {
        this.grandFatherName = grandFather;
        this.grandMotherName = grandMother;
        System.out.println("Grand Father: "+this.grandFatherName+"\nGrand Mother: "+this.grandMotherName);
    }
}
class Parent extends GrandParent
{
    String fatherName;
    String motherName;
    Parent(String father, String mother, String grandFather, String grandMother)
    {
        this.fatherName = father;
        this.motherName = mother;
        this.grandFatherName = grandFather;
        this.grandMotherName = grandMother;
        System.out.println("Father: "+this.fatherName+"Mother: "+this.motherName);
    }
}
class Child extends Parent
{
    public static void main(String[] args)
    {
        // Child c = new Child();
    }
}
