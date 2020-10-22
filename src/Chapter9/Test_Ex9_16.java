package Chapter9;
import org.junit.Assert;
import org.junit.Test;

public class Test_Ex9_16 {
    @Test
    public void test1(){
        Assert.assertEquals("Не верно указан час", Ex9_16.showInfo(0));
        Assert.assertEquals("Утро", Ex9_16.showInfo(6));
        Assert.assertEquals("Утро", Ex9_16.showInfo(7));
        Assert.assertEquals("Утро", Ex9_16.showInfo(8));
        Assert.assertEquals("Утро", Ex9_16.showInfo(9));

        Assert.assertEquals("День", Ex9_16.showInfo(11));
        Assert.assertEquals("День", Ex9_16.showInfo(12));
        Assert.assertEquals("День", Ex9_16.showInfo(13));
        Assert.assertEquals("День", Ex9_16.showInfo(14));
        Assert.assertEquals("День", Ex9_16.showInfo(15));
        Assert.assertEquals("День", Ex9_16.showInfo(16));
        Assert.assertEquals("День", Ex9_16.showInfo(17));
        Assert.assertEquals("День", Ex9_16.showInfo(18));

        Assert.assertEquals("Вечер", Ex9_16.showInfo(19));
        Assert.assertEquals("Вечер", Ex9_16.showInfo(20));
        Assert.assertEquals("Вечер", Ex9_16.showInfo(21));
        Assert.assertEquals("Вечер", Ex9_16.showInfo(22));

        Assert.assertEquals("Ночь", Ex9_16.showInfo(23));
        Assert.assertEquals("Ночь", Ex9_16.showInfo(24));
        Assert.assertEquals("Ночь", Ex9_16.showInfo(1));
        Assert.assertEquals("Ночь", Ex9_16.showInfo(2));
        Assert.assertEquals("Ночь", Ex9_16.showInfo(3));
        Assert.assertEquals("Ночь", Ex9_16.showInfo(4));
        Assert.assertEquals("Ночь", Ex9_16.showInfo(5));


    }
}
