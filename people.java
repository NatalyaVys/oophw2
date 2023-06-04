package oophw2;

public class people {

    private String name;
    private Integer age;
    private Long id;
    private boolean isMakeOrder;
    private boolean isTakeOrder;

    public people(String name, Integer age, Long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", getName(), getAge(), getId());
    }


}