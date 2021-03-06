package com.xml;  
  
import java.io.Serializable;  
import java.util.Date;  
import java.util.List;  
  
import javax.xml.bind.annotation.XmlAccessType;  
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;  
import javax.xml.bind.annotation.XmlType;  
  
/** 
 *  
 * @author Steven 
 *  
 */  
@XmlAccessorType(XmlAccessType.NONE)  
// XML文件中的根标识  
@XmlRootElement(name = "User")  
// 控制JAXB 绑定类中属性和字段的排序  
@XmlType(propOrder = {   
        "userId",   
        "userName",   
        "password",   
        "birthday",   
        "money",   
        "computers"  
})  
public class User implements Serializable {  
    private static final long serialVersionUID = 1L;  
  
    // 用户Id  
    @XmlAttribute
    private int userId;  
    // 用户名  
    @XmlAttribute
    private String userName;  
    // 用户密码  
    @XmlAttribute(name="password")
    private String password;  
    // 用户生日  
    @XmlAttribute(name="birthday")
    private Date birthday;  
    // 用户钱包  
    @XmlAttribute(name="money")
    private double money;  
    // 拥有的电脑  
    @XmlElementWrapper(name="computers")
    @XmlElement(name="computer")
    private List<Computer> computers;  
  
    public User() {  
        super();  
    }  
  
    public User(int userId, String userName, String password, Date birthday,  
            double money) {  
        super();  
        this.userId = userId;  
        this.userName = userName;  
        this.password = password;  
        this.birthday = birthday;  
        this.money = money;  
    }  
  
    public int getUserId() {  
        return userId;  
    }  
  
    public void setUserId(int userId) {  
        this.userId = userId;  
    }  
  
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public Date getBirthday() {  
        return birthday;  
    }  
  
    public void setBirthday(Date birthday) {  
        this.birthday = birthday;  
    }  
  
    public double getMoney() {  
        return money;  
    }  
  
    public void setMoney(double money) {  
        this.money = money;  
    }  
  
    public void setComputers(List<Computer> computers) {  
        this.computers = computers;  
    }  
    public List<Computer> getComputers() {  
        return this.computers;  
    }  
  
    @Override  
    public String toString() {  
        return "User [birthday=" + birthday + ", computers=" + computers.toString()  
                + ", money=" + money + ", password=" + password + ", userId="  
                + userId + ", userName=" + userName + "]";  
    }  
      
}  