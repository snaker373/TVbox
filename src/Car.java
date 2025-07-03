public class Car {
    private int id;
    private String mark;
    private String modelName;
    private int maxSpeed;
    private int minSpeed;
    private int age;

    public Car(){
    }
    public int getId() {
        return id;
    }
    public String getMark() {
        return mark;
    }
    public String getModelName() {
        return modelName;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getMinSpeed() {
        return minSpeed;
    }
    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void drive(){
        System.out.println("This car is driving");
    }

    public String getinfo(){
        return "Car info: \n" + "Id: " + id + "\n" + "Mark: " + mark + "\n" + "Name: " + modelName + "\n" + "speed: " + maxSpeed + "\n" + "age: " + age + "\n";
    }

}
