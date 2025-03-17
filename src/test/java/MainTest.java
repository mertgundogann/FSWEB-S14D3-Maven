//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ResultAnalyzer.class})
public class MainTest {
    Car car;
    Mitsubishi mitsubishi;
    Holden holden;
    Ford ford;
    CarSkeleton carSkeleton;
    GasPoweredCar gasPoweredCar;
    HybridCar hybridCar;
    ElectricCar electricCar;

    public MainTest() {
    }

    @BeforeEach
    void setUp() {
        this.car = new Car(4, "Mercedes");
        this.mitsubishi = new Mitsubishi(4, "Mitsubishi");
        this.holden = new Holden(4, "Holden");
        this.ford = new Ford(4, "Ford");
        this.carSkeleton = new CarSkeleton("Test", "test");
        this.electricCar = new ElectricCar("Test", "test", (double)10.0F, 5);
        this.gasPoweredCar = new GasPoweredCar("Test", "test", (double)10.0F, 4);
        this.hybridCar = new HybridCar("Test", "test", (double)10.0F, 5, 4);
    }

    @DisplayName("Car sınıf değişkenleri doğru access modifier değerlerine sahip mi ?")
    @Test
    public void testCarAccessModifiers() throws NoSuchFieldException {
        Field nameField = this.car.getClass().getDeclaredField("name");
        Field cylindersField = this.car.getClass().getDeclaredField("cylinders");
        Field engineField = this.car.getClass().getDeclaredField("engine");
        Field wheelsField = this.car.getClass().getDeclaredField("wheels");
        Assertions.assertEquals(nameField.getModifiers(), 2);
        Assertions.assertEquals(cylindersField.getModifiers(), 2);
        Assertions.assertEquals(engineField.getModifiers(), 2);
        Assertions.assertEquals(wheelsField.getModifiers(), 2);
    }

    @DisplayName("Car sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testLampAccessModifiers() throws NoSuchFieldException {
        MatcherAssert.assertThat(this.car.getName(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.car.getCylinders(), Matchers.instanceOf(Integer.class));
    }

    @DisplayName("Car startEngine metodu doğru çalışıyor mu ?")
    @Test
    public void testStartEngineMethod() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Assertions.assertEquals(this.car.startEngine(), "the car's engine is starting");
        MatcherAssert.assertThat(out.toString(), Matchers.containsString(this.car.getClass().getSimpleName()));
    }

    @DisplayName("Car accelerate metodu doğru çalışıyor mu ?")
    @Test
    public void testAccelerate() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Assertions.assertEquals(this.car.accelerate(), "the car is accelerating");
        MatcherAssert.assertThat(out.toString(), Matchers.containsString(this.car.getClass().getSimpleName()));
    }

    @DisplayName("Car brake metodu doğru çalışıyor mu ?")
    @Test
    public void testBrake() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Assertions.assertEquals(this.car.brake(), "the car is braking");
        MatcherAssert.assertThat(out.toString(), Matchers.containsString(this.car.getClass().getSimpleName()));
    }

    @DisplayName("Mitsubishi, Ford, Holden doğru sınıf tipinde mi ?")
    @Test
    public void testChildClassTypes() throws NoSuchFieldException {
        MatcherAssert.assertThat(this.mitsubishi, Matchers.instanceOf(Car.class));
        MatcherAssert.assertThat(this.ford, Matchers.instanceOf(Ford.class));
        MatcherAssert.assertThat(this.holden, Matchers.instanceOf(Holden.class));
    }

    @DisplayName("CarSkeleton sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testCarSkeletonInstanceTypes() throws NoSuchFieldException {
        MatcherAssert.assertThat(this.carSkeleton.getName(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.carSkeleton.getDescription(), Matchers.instanceOf(String.class));
    }

    @DisplayName("CarSkeleton metodları doğru type değerlerine sahip mi ?")
    @Test
    public void testCarSkeletonMethodTypes() throws NoSuchMethodException {
        Method startEngineMethod = this.carSkeleton.getClass().getDeclaredMethod("startEngine");
        Method driveMethod = this.carSkeleton.getClass().getDeclaredMethod("drive");
        Assertions.assertEquals(startEngineMethod.getModifiers(), 1);
        Assertions.assertEquals(driveMethod.getModifiers(), 1);
    }

    @DisplayName("ElectricCar sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testElectricCar() throws NoSuchMethodException {
        MatcherAssert.assertThat(this.electricCar.getName(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.electricCar.getDescription(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.electricCar.getBatterySize(), Matchers.instanceOf(Integer.class));
        MatcherAssert.assertThat(this.electricCar.getAvgKmPerCharge(), Matchers.instanceOf(Double.class));
    }

    @DisplayName("GasPoweredCar sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testGasPoweredCar() throws NoSuchMethodException {
        MatcherAssert.assertThat(this.gasPoweredCar.getName(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.gasPoweredCar.getDescription(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.gasPoweredCar.getAverageKmPerLiter(), Matchers.instanceOf(Double.class));
        MatcherAssert.assertThat(this.gasPoweredCar.getCylinders(), Matchers.instanceOf(Integer.class));
    }

    @DisplayName("HybridCar sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testHybridCar() throws NoSuchMethodException {
        MatcherAssert.assertThat(this.hybridCar.getName(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.hybridCar.getDescription(), Matchers.instanceOf(String.class));
        MatcherAssert.assertThat(this.hybridCar.getCylinders(), Matchers.instanceOf(Integer.class));
        MatcherAssert.assertThat(this.hybridCar.getAvgKmPerLiter(), Matchers.instanceOf(Double.class));
        MatcherAssert.assertThat(this.hybridCar.getBatterySize(), Matchers.instanceOf(Integer.class));
    }

    @DisplayName("GasPoweredCar, ElectricCar ve HybridCar sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testCarTypes() throws NoSuchMethodException {
        MatcherAssert.assertThat(this.electricCar, Matchers.instanceOf(CarSkeleton.class));
        MatcherAssert.assertThat(this.gasPoweredCar, Matchers.instanceOf(CarSkeleton.class));
        MatcherAssert.assertThat(this.hybridCar, Matchers.instanceOf(CarSkeleton.class));
    }
}
