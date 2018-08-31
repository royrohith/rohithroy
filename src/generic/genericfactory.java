package generic;


public class genericfactory<T> {

    Class<T> c;

    public genericfactory(Class<T> c){
        this.c = c;
    }

    public Class<T> getObjectType(){
        return c;
    }

    public T getObject() throws IllegalAccessException, InstantiationException {
        try {
            return (T) getObjectType().newInstance();//creating object
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        product p=new genericfactory<Soap>(Soap.class).getObject();//passing to created object of soap
        System.out.println(p.getName());

        p=new genericfactory<Oil>(Oil.class).getObject();//passing to created object of oil
        System.out.println(p.getName());
    }


}
