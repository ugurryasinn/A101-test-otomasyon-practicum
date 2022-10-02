import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;

public class test {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[1]/div[2]/button[4]")).click();

        driver.get("https://www.a101.com.tr/giyim-aksesuar/");
        driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[3]/div/div[1]/div[1]/div[1]/ul/li[6]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[1]/ul/li[4]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a")).click();
        Thread.sleep(5000);

        WebElement colour = driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div/div[1]/span"));
        System.out.print(colour.getText());

        if (colour.getText().equals("SİYAH")) {
            driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/a[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a")).click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input")).sendKeys("uguryasinkucuk@gmail.com");
            //üye olma e postası
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a")).click(); //adress oluştur button.

            //adress güncelleme tablosu doldurma
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div/div/label/input")).sendKeys("Ev adresi");
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[1]/div/label/input")).sendKeys("Uğur Yasin");
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/div/label/input")).sendKeys("Küçük");
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div/div/label/input")).sendKeys("5358475505");
            Thread.sleep(2000);

            WebElement il_listbox = driver.findElement(By.name("city"));
            Random rand = new Random();
            rand.nextInt();
            new Select(il_listbox).selectByIndex(rand.nextInt(1,81));
            Thread.sleep(2000);

            WebElement ilce_listbox = driver.findElement(By.name("township"));
            rand.nextInt();
            new Select(ilce_listbox).selectByIndex(rand.nextInt(1,5));
            Thread.sleep(2000);

            WebElement mahalle_listbox = driver.findElement(By.name("district"));
            rand.nextInt();
            new Select(mahalle_listbox).selectByIndex(rand.nextInt(1,5));
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[7]/label/textarea")).sendKeys("Mescit Mah. Sarı Sokak No:18 İç kapı No:9");
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button[1]")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[2]/ul/li[1]/label/div[2]/div")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
        }

    }
}

