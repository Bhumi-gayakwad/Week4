package annotations.use_override;
// Subclass with @Override
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}