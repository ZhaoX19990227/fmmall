<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [JAVA开发六大原则](#java%E5%BC%80%E5%8F%91%E5%85%AD%E5%A4%A7%E5%8E%9F%E5%88%99)
- [抽象类和接口的对比](#%E6%8A%BD%E8%B1%A1%E7%B1%BB%E5%92%8C%E6%8E%A5%E5%8F%A3%E7%9A%84%E5%AF%B9%E6%AF%94)
- [如何去设计类和接口（Effective Java）](#%E5%A6%82%E4%BD%95%E5%8E%BB%E8%AE%BE%E8%AE%A1%E7%B1%BB%E5%92%8C%E6%8E%A5%E5%8F%A3effective-java)
  - [1、使类和成员的可访问性最小化](#1%E4%BD%BF%E7%B1%BB%E5%92%8C%E6%88%90%E5%91%98%E7%9A%84%E5%8F%AF%E8%AE%BF%E9%97%AE%E6%80%A7%E6%9C%80%E5%B0%8F%E5%8C%96)
  - [2、复合优先于继承](#2%E5%A4%8D%E5%90%88%E4%BC%98%E5%85%88%E4%BA%8E%E7%BB%A7%E6%89%BF)
  - [3、接口优于抽象类](#3%E6%8E%A5%E5%8F%A3%E4%BC%98%E4%BA%8E%E6%8A%BD%E8%B1%A1%E7%B1%BB)
  - [4、优先考虑静态成员类](#4%E4%BC%98%E5%85%88%E8%80%83%E8%99%91%E9%9D%99%E6%80%81%E6%88%90%E5%91%98%E7%B1%BB)
- [三大特性](#%E4%B8%89%E5%A4%A7%E7%89%B9%E6%80%A7)
  - [多态](#%E5%A4%9A%E6%80%81)
  - [重载](#%E9%87%8D%E8%BD%BD)
- [使用final的意义](#%E4%BD%BF%E7%94%A8final%E7%9A%84%E6%84%8F%E4%B9%89)
- [四大引用](#%E5%9B%9B%E5%A4%A7%E5%BC%95%E7%94%A8)
- [值传递和引用传递的区别？](#%E5%80%BC%E4%BC%A0%E9%80%92%E5%92%8C%E5%BC%95%E7%94%A8%E4%BC%A0%E9%80%92%E7%9A%84%E5%8C%BA%E5%88%AB)
  - [值传递](#%E5%80%BC%E4%BC%A0%E9%80%92)
  - [引用传递](#%E5%BC%95%E7%94%A8%E4%BC%A0%E9%80%92)
- [equals()](#equals)
  - [==和equals的区别？实现equals要注意哪些东西？](#%E5%92%8Cequals%E7%9A%84%E5%8C%BA%E5%88%AB%E5%AE%9E%E7%8E%B0equals%E8%A6%81%E6%B3%A8%E6%84%8F%E5%93%AA%E4%BA%9B%E4%B8%9C%E8%A5%BF)
  - [equals()与hashCode()之间的关系](#equals%E4%B8%8Ehashcode%E4%B9%8B%E9%97%B4%E7%9A%84%E5%85%B3%E7%B3%BB)
- [一个字符（英文字母）占多少个字节，一个中文占多少字节？](#%E4%B8%80%E4%B8%AA%E5%AD%97%E7%AC%A6%E8%8B%B1%E6%96%87%E5%AD%97%E6%AF%8D%E5%8D%A0%E5%A4%9A%E5%B0%91%E4%B8%AA%E5%AD%97%E8%8A%82%E4%B8%80%E4%B8%AA%E4%B8%AD%E6%96%87%E5%8D%A0%E5%A4%9A%E5%B0%91%E5%AD%97%E8%8A%82)
- [java中double和float精度丢失问题及解决方法](#java%E4%B8%ADdouble%E5%92%8Cfloat%E7%B2%BE%E5%BA%A6%E4%B8%A2%E5%A4%B1%E9%97%AE%E9%A2%98%E5%8F%8A%E8%A7%A3%E5%86%B3%E6%96%B9%E6%B3%95)
  - [BigDecimal](#bigdecimal)
- [注解](#%E6%B3%A8%E8%A7%A3)
  - [元注解（4个）](#%E5%85%83%E6%B3%A8%E8%A7%A34%E4%B8%AA)
  - [自定义注解](#%E8%87%AA%E5%AE%9A%E4%B9%89%E6%B3%A8%E8%A7%A3)
- [Arrays.sort()原理分析](#arrayssort%E5%8E%9F%E7%90%86%E5%88%86%E6%9E%90)
  - [源码中的快速排序，主要做了以下几个方面的优化](#%E6%BA%90%E7%A0%81%E4%B8%AD%E7%9A%84%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F%E4%B8%BB%E8%A6%81%E5%81%9A%E4%BA%86%E4%BB%A5%E4%B8%8B%E5%87%A0%E4%B8%AA%E6%96%B9%E9%9D%A2%E7%9A%84%E4%BC%98%E5%8C%96)
- [foreach和while的区别(编译之后)](#foreach%E5%92%8Cwhile%E7%9A%84%E5%8C%BA%E5%88%AB%E7%BC%96%E8%AF%91%E4%B9%8B%E5%90%8E)
- [创建一个类的几种方法?](#%E5%88%9B%E5%BB%BA%E4%B8%80%E4%B8%AA%E7%B1%BB%E7%9A%84%E5%87%A0%E7%A7%8D%E6%96%B9%E6%B3%95)
- [Redirect和forward](#redirect%E5%92%8Cforward)
- [Object跟这些标记符代表的java类型有啥区别呢？](#object%E8%B7%9F%E8%BF%99%E4%BA%9B%E6%A0%87%E8%AE%B0%E7%AC%A6%E4%BB%A3%E8%A1%A8%E7%9A%84java%E7%B1%BB%E5%9E%8B%E6%9C%89%E5%95%A5%E5%8C%BA%E5%88%AB%E5%91%A2)
- [Java 异常](#java-%E5%BC%82%E5%B8%B8)
  - [throw和throws区别](#throw%E5%92%8Cthrows%E5%8C%BA%E5%88%AB)
  - [什么情况finally不会执行](#%E4%BB%80%E4%B9%88%E6%83%85%E5%86%B5finally%E4%B8%8D%E4%BC%9A%E6%89%A7%E8%A1%8C)
  - [finally方法一定会被执行么？](#finally%E6%96%B9%E6%B3%95%E4%B8%80%E5%AE%9A%E4%BC%9A%E8%A2%AB%E6%89%A7%E8%A1%8C%E4%B9%88)
- [.class 文件是什么类型文件](#class-%E6%96%87%E4%BB%B6%E6%98%AF%E4%BB%80%E4%B9%88%E7%B1%BB%E5%9E%8B%E6%96%87%E4%BB%B6)
- [java中序列化之子类继承父类序列化](#java%E4%B8%AD%E5%BA%8F%E5%88%97%E5%8C%96%E4%B9%8B%E5%AD%90%E7%B1%BB%E7%BB%A7%E6%89%BF%E7%88%B6%E7%B1%BB%E5%BA%8F%E5%88%97%E5%8C%96)
- [标识符](#%E6%A0%87%E8%AF%86%E7%AC%A6)
- [Integer i=new Integer(127);和Integer i=127;的区别](#integer-inew-integer127%E5%92%8Cinteger-i127%E7%9A%84%E5%8C%BA%E5%88%AB)
- [手写单例模式](#%E6%89%8B%E5%86%99%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F)
- [为什么线程通信的方法wait(), notify()和notifyAll()被定义在Object类里？](#%E4%B8%BA%E4%BB%80%E4%B9%88%E7%BA%BF%E7%A8%8B%E9%80%9A%E4%BF%A1%E7%9A%84%E6%96%B9%E6%B3%95wait-notify%E5%92%8Cnotifyall%E8%A2%AB%E5%AE%9A%E4%B9%89%E5%9C%A8object%E7%B1%BB%E9%87%8C)
- [Java中wait 和sleep 方法比较](#java%E4%B8%ADwait-%E5%92%8Csleep-%E6%96%B9%E6%B3%95%E6%AF%94%E8%BE%83)
- [hashCode和equals方法的关系](#hashcode%E5%92%8Cequals%E6%96%B9%E6%B3%95%E7%9A%84%E5%85%B3%E7%B3%BB)
- [Object类中有哪些方法](#object%E7%B1%BB%E4%B8%AD%E6%9C%89%E5%93%AA%E4%BA%9B%E6%96%B9%E6%B3%95)
- [String](#string)
  - [String s=new String("xyz")究竟创建String Object分为两种情况](#string-snew-stringxyz%E7%A9%B6%E7%AB%9F%E5%88%9B%E5%BB%BAstring-object%E5%88%86%E4%B8%BA%E4%B8%A4%E7%A7%8D%E6%83%85%E5%86%B5)
  - [Java中由substring方法引发的内存泄漏](#java%E4%B8%AD%E7%94%B1substring%E6%96%B9%E6%B3%95%E5%BC%95%E5%8F%91%E7%9A%84%E5%86%85%E5%AD%98%E6%B3%84%E6%BC%8F)
- [什么是值传递和引用传递](#%E4%BB%80%E4%B9%88%E6%98%AF%E5%80%BC%E4%BC%A0%E9%80%92%E5%92%8C%E5%BC%95%E7%94%A8%E4%BC%A0%E9%80%92)
- [什么是泛型，为什么要使用以及类型擦除](#%E4%BB%80%E4%B9%88%E6%98%AF%E6%B3%9B%E5%9E%8B%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E4%BD%BF%E7%94%A8%E4%BB%A5%E5%8F%8A%E7%B1%BB%E5%9E%8B%E6%93%A6%E9%99%A4)
- [什么是序列化？为什么要序列化？](#%E4%BB%80%E4%B9%88%E6%98%AF%E5%BA%8F%E5%88%97%E5%8C%96%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E5%BA%8F%E5%88%97%E5%8C%96)
- [反射](#%E5%8F%8D%E5%B0%84)
  - [优点](#%E4%BC%98%E7%82%B9)
  - [缺点](#%E7%BC%BA%E7%82%B9)
- [Java1.0-1.12各个版本的新特性](#java10-112%E5%90%84%E4%B8%AA%E7%89%88%E6%9C%AC%E7%9A%84%E6%96%B0%E7%89%B9%E6%80%A7)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->



## JAVA开发六大原则
1. 单一原则 : 一个类或一个方法只负责一件事情
2. 里斯替换原则: 子类不应该重写父类已实现的方法,重载不应该比父类的参数更少
3. 依赖倒置原则: 面向接口编程.（面向接口更能添加程序的可扩展性）
4. 接口隔离原则: 接口中的方法应该细分,要合理的隔离开不同的功能到不同的接口中.
5. 迪米特原则: 高内聚低耦合
6. 开闭原则: 对修改关闭，对扩展开放

总结: 用抽象构建框架，用实现扩展细节

## 抽象类和接口的对比
| 参数        | 抽象类   |  接口  |
| --------   | -----:   | :----: |
|默认的方法实现	|它可以有默认的方法实现	|接口完全是抽象的。它根本不存在方法的实现|
|实现	|子类使用extends关键字来继承抽象类。如果子类不是抽象类的话，它需要提供抽象类中所有声明的方法的实现。|	子类使用关键字implements来实现接口。它需要提供接口中所有声明的方法的实现|
|构造器	|抽象类可以有构造器|	接口不能有构造器|
|与正常Java类的区别	|除了你不能实例化抽象类之外，它和普通Java类没有任何区别	|接口是完全不同的类型|
|访问修饰符	|抽象方法可以有public、protected和default这些修饰符|	接口方法默认修饰符是public。你不可以使用其它修饰符。|
|main方法|	抽象方法可以有main方法并且我们可以运行它	|接口没有main方法，因此我们不能运行它。|
|多继承	|抽象方法可以继承一个类和实现多个接口	|接口只可以继承一个或多个其它接口|
|速度|	它比接口速度要快|	接口是稍微有点慢的，因为它需要时间去寻找在类中实现的方法。|
|添加新方法	|如果你往抽象类中添加新的方法，你可以给它提供默认的实现。因此你不需要改变你现在的代码。|	如果你往接口中添加方法，那么你必须改变实现该接口的类。|


## 如何去设计类和接口（Effective Java）
### 1、使类和成员的可访问性最小化
尽可能地使每个类或者成员不被外界访问，尽可能最小的访问级别。
### 2、复合优先于继承
与方法调用不同的是，继承打破了封装性。超类的实现有可能会随着发行版本的不同而有所变化，如果真的发生了变化，子类可能会遭到破坏，即使它的代码完全没有改变。

建议新的类中增加一个私有域，它引现有类的一个实例。这种设计被称做“复合(composition)
### 3、接口优于抽象类
如果你希望让两个类扩展同一个抽象类，就必须把抽象类放到类型层次结构的高处，以便这两个类的一个祖先成为它的子类。遗憾的是这样做会间接到伤害到类层次，迫使这个公共祖先到所有后代类都扩展这个新的抽象类，无论它对于这些后代类是否合适。
### 4、优先考虑静态成员类
非静态成员类的每个实例都隐含着与外围类的一个外围实例(enclosing instance)相关联。

## 三大特性
### 多态
**好处**
1. 提高了代码的维护性(继承保证)
2. 提高了代码的扩展性(由多态保证)
多态：同一操作作用于不同的对象，可以有不同的解释，产生不同的执行结果。在复运行时，可以通过指向基类的指针，来调用实现派生类中的方法。

**实现原理**
多态是面向对象编程语言的重要特性，它允许基类的指针或引用指向派生类的对象，而在具体访问时实现方法的动态绑定。

Java 对于方法调用**动态绑定**的实现主要依赖于**方法表**，但通过**类引用调**用(invokevitual)和**接口引用调用**(invokeinterface)的实现则有所不同

### 重载
在编译器眼里，方法名称+参数类型+参数个数，组成一个唯一键，称为方法签名。返回值并不是方法签名的一部分，会导致编译出错。

**一个引用变量到底会指向哪个类的实例对象，该引用变量发出的方法调用到底是哪个类中实现的方法，必须在由程序运行期间才能决定。**

## 使用final的意义
1. 为方法“上锁”，防止任何继承类改变它的本来含义和实现。设计程序时，若希望一个方法的行为在继承期间保持不变，而且不可被覆盖或改写，就可以采取这种做法。
2. 提高程序执行的效率，将一个方法设成final后，编译器就可以把对那个方法的所有调用都置入“嵌入”调用里（内嵌机制）
3. 如果一个数据既是static又是final，那么它会拥有一块无法改变的存储空间


## 四大引用
| 引用类型 | 回收时机 | 使用场景 |
|--|--|--|
|强引用  |  不回收| 创建对象实例 |
|软引用  | 内存不足时 | 图片缓存 |
| 弱引用 | 垃圾回收 | WeakHashMap，维护一种非强制的映射关系 |
| 虚引用 | Unknow | 跟踪对象垃圾回收的活动 |

## 值传递和引用传递的区别？
### 值传递
在方法被调用时，实参通过形参把它的内容副本传入方法内部，此时形参接收到的内容是实参值的一个拷贝，因此在方法内对形参的任何操作，**都仅仅是对这个副本的操作**，不影响原始值的内容。
```
 public static void valueCrossTest(int age, float weight){
        System.out.println("传入的age：" + age);
        System.out.println("传入的weight：" + weight);
        age = 33;
        weight = 89.5f;
        System.out.println("方法内重新赋值后的age：" + age);
        System.out.println("方法内重新赋值后的weight：" + weight);
    }

    public static void main(String[] args) {
        int a = 25;
        float w = 77.5f;
        valueCrossTest(a, w);
        System.out.println("方法执行后的age：" + a);
        System.out.println("方法执行后的weight："+w);
    }
```
```
传入的age：25
传入的weight：77.5
方法内重新赋值后的age：33
方法内重新赋值后的weight：89.5
方法执行后的age：25
方法执行后的weight：77.5
```
![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/Java-25.png)

只是改变了当前栈帧（valueCrossTest方法所在栈帧）里的内容，当方法执行结束之后，这些局部变量都会被销毁，mian方法所在栈帧重新回到栈顶，成为当前栈帧，再次输出a和w时，依然是初始化时的内容。

**值传递传递的是真实内容的一个副本，对副本的操作不影响原内容，也就是形参怎么变化，不会影响实参对应的内容。**


### 引用传递
**”引用”也就是指向真实内容的地址值**，在方法调用时，实参的地址通过方法调用被传递给相应的形参，在方法体内，**形参和实参指向通愉快内存地址，对形参的操作会影响的真实内容**。
```
 public static void PersonCrossTest(Person person){
        System.out.println("传入的person的name："+person.getName());
        person.setName("我是张小龙");
        System.out.println("方法内重新赋值后的name："+person.getName());
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("我是马化腾");
        p.setAge(45);
        PersonCrossTest(p);
        System.out.println("方法执行后的name："+p.getName());
    }
```
```
传入的person的name：我是马化腾
方法内重新赋值后的name：我是张小龙
方法执行后的name：我是张小龙
```
可以看出，person经过personCrossTest()方法的执行之后，内容发生了改变，这印证了上面所说的“引用传递”，对形参的操作，改变了实际对象的内容。

修改一下
```
  public static void PersonCrossTest(Person person){
        System.out.println("传入的person的name："+person.getName());
        person=new Person();//加多此行代码
        person.setName("我是张小龙");
        System.out.println("方法内重新赋值后的name："+person.getName());
    }
```
```
传入的person的name：我是马化腾
方法内重新赋值后的name：我是张小龙
方法执行后的name：我是马化腾
```
JVM需要在堆内另外开辟一块内存来存储new Person()，假如地址为“xo3333”，那此时形参person指向了这个地址，假如真的是引用传递，那么由上面讲到：引用传递中形参实参指向同一个对象，形参的操作会改变实参对象的改变。


## equals()
1. Obejct的equals()源码
```java
public boolean equals(Object obj) {
        return (this == obj);
    }

```
从代码可知，Object类的equals方法是比较的地址，所以最初的equals方法和==的作用是一致的

像String、Double、Integer、Date、Point这些不变类都重写了equals()，重写都是为判断的根据是值，而不地址

比如String的equals()源码
```java
public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
```
比如Integer的equals()源码
```java
public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
```

### ==和equals的区别？实现equals要注意哪些东西？
**==和equals的区别**
- ==:判断两个字符串在内存中首地址是否相同,即判断两者是否是同一个字符串对象
- equles():如果没有重写equals()方法比较的是对象的地址,因为对Object来说对象没有什么属性可以比较,只能比较最底层的地址。
而如果重写equals()方法时,该方法的对象因为是Object的子类,所以调用时会调用子类对象里面的方法.所以只有重写equals()方法后,两者比较的才是内容.或者说重写可以使自己定义比较的规则,不想按照地址去比较.

**实现equals要注意哪些东西？**
1、自反性：对于任何非空引用x，x.equals(x)应该返回true。
2、对称性：对于任何引用x和y，如果x.equals(y)返回true，那么y.equals(x)也应该返回true。
3、传递性：对于任何引用x、y和z，如果x.equals(y)返回true，y.equals(z)返回true，那么x.equals(z)也应该返回true。
4、一致性：如果x和y引用的对象没有发生变化，那么反复调用x.equals(y)应该返回同样的结果。
5、非空性：对于任意非空引用x，x.equals(null)应该返回false。
compareTo()
```java
  public int compareTo(Integer anotherInteger) {
        return compare(this.value, anotherInteger.value);
    }

   public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
   }
```

### equals()与hashCode()之间的关系
- 如果两个对象equals()方法相等则它们的hashCode返回值一定要相同，如果两个对象的hashCode返回值相同，但它们的equals()方法不一定相等。
- hashCode()的作用是为了提高在散列结构存储中查找的效率
- Java中重写equals()方法时尽量要重写hashCode()方法的原因：声明相等对象必须具有相等的哈希码，包括 HashMap、HashSet、Hashtable 等

## 一个字符（英文字母）占多少个字节，一个中文占多少字节？
- 一个字符占1个字节（GBK、ASCII、UTF-8）
- 一个中文占 2 个字节（GBK、ASCII）
- 一个中文占 3 个字节（UTF-8）

## java中double和float精度丢失问题及解决方法
```java
 System.out.println(0.11+2001299.32);
```
控制台输出2001299.4300000002

在需要精确的表示两位小数时我们需要把他们转换为BigDecimal对象，然后再进行运算。

另外需要注意

使用BigDecimal(double val)构造函数时仍会存在精度丢失问题，建议使用BigDecimal(String val)


### BigDecimal
```java
public BigDecimal(double val)
```
将 double 转换为 BigDecimal，后者是 double 的二进制浮点值准确的十进制表示形式。返回的 BigDecimal 的标度是使 (10scale × val) 为整数的最小值。
注：

1. 此构造方法的结果有一定的不可预知性。有人可能认为在 Java 中写入 new BigDecimal(0.1) 所创建的 BigDecimal 正好等于 0.1（非标度值 1，其标度为 1），但是它实际上等于 0.1000000000000000055511151231257827021181583404541015625。这是因为 0.1 无法准确地表示为 double（或者说对于该情况，不能表示为任何有限长度的二进制小数）。这样，传入 到构造方法的值不会正好等于 0.1（虽然表面上等于该值）。
2. 另一方面，String 构造方法是完全可预知的：写入 new BigDecimal("0.1") 将创建一个 BigDecimal，它正好 等于预期的 0.1。因此，比较而言，通常建议优先使用 String 构造方法。
3. 当 double 必须用作 BigDecimal 的源时，请注意，此构造方法提供了一个准确转换；它不提供与以下操作相同的结果：先使用 Double.toString(double) 方法，然后使用 BigDecimal(String) 构造方法，将 double 转换为 String。要获取该结果，请使用 static valueOf(double) 方法。


## 注解

### 元注解（4个）

1. @Target – 作用域
- ElementType.TYPE 用于描述类、接口或enum声明
- ElementType.FIELD 用于描述实例变量
- ElementType.METHOD 方法声明
- ElementType.PARAMETER 参数
- ElementType.CONSTRUCTOR 构造器
- ElementType.LOCAL_VARIABLE 局部变量
- ElementType.ANNOTATION_TYPE 另一个注释
- ElementType.PACKAGE  包

2. @Retention 生命周期,定义了该Annotation被保留的时间长短
- RetentionPolicy.SOURCE – 在源文件中有效（即源文件保留）
- RetentionPolicy.CLASS – 在class文件中有效（即class保留）
- RetentionPolicy.RUNTIME– 在运行时有效（即运行时保留）

3.  @Documented  是否生成javadoc文档。

4. @Inherited  是否被子类继承

### 自定义注解
使用@interface自定义注解时，自动继承了java.lang.annotation.Annotation接口，由编译程序自动完成其他细节。在定义注解时，不能继承其他的注解或接口。
@interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）。可以通过default来声明参数的默认值。

格式：public @interface 注解名 {定义体}

```java
/**
 * 水果名称注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
```
```java
public class Apple {
    @FruitName("Apple")
    private String appleName;
    }
```

## Arrays.sort()原理分析
首先说一下，Collections.sort方法底层也是调用的Arrays.sort方法。

Java Arrays中提供了对所有类型的排序。其中主要分为Primitive(8种基本类型)和Object两大类。

1. 基本类型：采用调优的快速排序；

2. 对象类型：采用改进的归并排序。既快速（nlog(n)）又稳定，对象数组中保存的只是对象的引用，这样多次移位并不会造成额外的开销，但是，对象数组对比较次数一般比较敏感，有可能对象的比较比单纯数的比较开销大很多。归并排序在这方面比快速排序做得更好，这也是选择它作为对象排序的一个重要原因之一。

排序优化：实现中快排和归并都采用递归方式，而在递归的底层，也就是待排序的数组长度小于7时，直接使用冒泡排序，而不再递归下去.

分析: 长度为6的数组冒泡排序总比较次数最多也就1+2+3+4+5+6=21次，最好情况下只有6次比较。而快排或归并涉及到递归调用等的开销，其时间效率在n较小时劣势就凸显了，因此这里采用了冒泡排序，这也是对快速排序极重要的优化。

### 源码中的快速排序，主要做了以下几个方面的优化
1. 当待排序的数组中的元素个数较少时，源码中的阀值为7，采用的是插入排序。尽管插入排序的时间复杂度为0(n^2)，但是当数组元素较少时，插入排序优于快速排序，因为这时快速排序的递归操作影响性能。

2. 较好的选择了划分元（基准元素）。能够将数组分成大致两个相等的部分，避免出现最坏的情况。例如当数组有序的的情况下，选择第一个元素作为划分元，将使得算法的时间复杂度达到O(n^2).

　　源码中选择划分元的方法:

- 当数组大小为 size=7 时 ，取数组中间元素作为划分元。int n=m>>1;(此方法值得借鉴)

- 当数组大小 7<size<=40时，取首、中、末三个元素中间大小的元素作为划分元。

- 当数组大小 size>40 时 ，从待排数组中较均匀的选择9个元素，选出一个伪中数做为划分元。

3.　普通的快速排序算法，经过一次划分后，将划分元排到素组较中间的位置，左边的元素小于划分元，右边的元素大于划分元，而没有将与划分元相等的元素放在其附近，这一点，在Arrays.sort()中得到了较大的优化，将与划分元相等的元素移到数组中间来


jdk1.7后底层实现都是TimeSort实现的。TimSort是优化后的归并排序，TimSort算法就是找到已经排好序数据的子序列，然后对剩余部分排序，然后合并起来.


## foreach和while的区别(编译之后) 
1. 在while循环里，会读入一行输入，把它存入某个变量并且执行循环主体。然后，它再回头去找其他的输入行。
2. 在foreach循环中，整行输入操作符会在列表上下文中执行（因为foreach需要逐行处理列表的内容）。在循环开始执行之前，它必须先将输入全部读进来。
3. 当输入大容量的文件时，使用foreach会占用大量的内存。两者的差异会十分明显。因此，最好的做法，通常是尽量使用while循环的简写，让它每次处理一行。

foreach 在编译的时候编译器会自动将对for这个关键字的使用转化为对目标的迭代器的使用，这就是foreach循环的原理

## 创建一个类的几种方法?

1. 使用new关键字 → 调用了构造函数
2. 使用Class类的newInstance方法  → 调用了构造函数
```java
Employee emp2 = (Employee)Class.forName("org.programming.mitra.exercises.Employee").newInstance();
```
3. 使用Constructor类的newInstance方法  → 调用了构造函数
```java
Constructor<Employee> constructor = Employee.class.getConstructor();
Employee emp3 = constructor.newInstance();
```
4. 使用clone方法   → 没有调用构造函数
5. 使用反序列化  → 没有调用构造函数

```java
ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
Employee emp5 = (Employee) in.readObject();
```

## Redirect和forward

1. 上图所示的间接转发请求的过程如下：
浏览器向Servlet1发出访问请求；
Servlet1调用sendRedirect()方法，将浏览器重定向到Servlet2；
浏览器向servlet2发出请求；
最终由Servlet2做出响应。 

2.  上图所示的直接转发请求的过程如下：
浏览器向Servlet1发出访问请求；
Servlet1调用forward()方法，在服务器端将请求转发给Servlet2；
最终由Servlet2做出响应。







## Object跟这些标记符代表的java类型有啥区别呢？  
Object是所有类的根类，任何类的对象都可以设置给该Object引用变量，使用的时候可能需要类型强制转换，但是用使用了泛型T、E等这些标识符后，在实际用之前类型就已经确定了，不需要再进行类型强制转换。



## Java 异常
Java把异常当作对象来处理，并定义一个基类java.lang.Throwable作为所有异常的超类。

在Java API中已经定义了许多异常类，这些异常类分为两大类，错误Error和异常Exception。

Java异常层次结构图如下图所示：

![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/Java-1.jpg)


Error：Error类对象由 Java 虚拟机生成并抛出，Error表示编译时和系统错误，通常不能预期和恢复，比如硬件故障、JVM崩溃、内存不足等 。例如，Java虚拟机运行错误（Virtual MachineError），当JVM不再有继续执行操作所需的内存资源时，将出现 OutOfMemoryError。这些异常发生时，Java虚拟机（JVM）一般会选择线程终止；还有发生在虚拟机试图执行应用时，如类定义错误（NoClassDefFoundError）、链接错误（LinkageError）。这些错误是不可查的，因为它们在应用程序的控制和处理能力之 外，而且绝大多数是程序运行时不允许出现的状况。对于设计合理的应用程序来说，即使确实发生了错误，本质上也不应该试图去处理它所引起的异常状况。在Java中，错误通常是使用Error的子类描述。

Exception：在Exception分支中有一个重要的子类RuntimeException（运行时异常），该类型的异常自动为你所编写的程序定义ArrayIndexOutOfBoundsException（数组下标越界）、NullPointerException（空指针异常）、ArithmeticException（算术异常）、MissingResourceException（丢失资源）、ClassNotFoundException（找不到类）等异常，这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理。这些异常一般是由程序逻辑错误引起的，程序应该从逻辑角度尽可能避免这类异常的发生；而RuntimeException之外的异常我们统称为非运行时异常，类型上属于Exception类及其子类，从程序语法角度讲是必须进行处理的异常，如果不处理，程序就不能编译通过。如IOException、SQLException等以及用户自定义的Exception异常，一般情况下不自定义检查异常。
### throw和throws区别
**throw：（针对对象的做法）**
 抛出一个异常，可以是系统定义的，也可以是自己定义的
 

```java
public void yichang(){
    NumberFormatException e = new NumberFormatException();
    throw e;
}
```
**throws：（针对一个方法抛出的异常）**
抛出一个异常，可以是系统定义的，也可以是自己定义的。

```java
public void yichang() throws NumberFormatException{
    int a = Integer.parseInt("10L");
}
```
1. throws出现在方法函数头；而throw出现在函数体。
2. throws表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某种异常。
3. 两者都是消极处理异常的方式（这里的消极并不是说这种方式不好），只是抛出或者可能抛出异常，但是不会由函数去处理异常，真正的处理异常由函数的上层调用处理。

### 什么情况finally不会执行
1、没有进入try代码块。
2、进入try代码块 ， 但是代码运行中出现了死循环或死锁状态。 
3、进入try代码块， 但是执行了 System.exit()操作。

注意， finally 是在 return 表达式运行后执行的 ， 此时将要 return 的结果 已 经被暂 存起来 ， 待 finally 代码块执行结束后再将之前暂存的结果返回

```
 private static int test1() {
        int tmp = 10000;
        try {
            throw new Exception();
        } catch (Exception e) {
           return ++tmp;
        } finally {
           tmp = 99999;
        }
    }

```

此方法最终的返回值是 10001 ，而不是 99999。

相对在 finally 代码块中赋值，更加危险的做法是在 finally块中使用 return 操作，这样的代码会使返回值变得非常不可控。
```
 private static int test1() {
 int x = 1;
 int y = 10;
 int z = 100;
        try {
           return ++x;
        } catch (Exception e) {
           return ++y;
        } finally {
           return ++z;
        }
    }

```
( 1 )最后 return 的功件是由 finally 代码块巾的 return ++z 完成的，所以为法返 回的结果是 101。
( 2 )语旬 return ++x 中的++x 被成功执行，所以运行结果是x=2。
( 3 ) 如果有异常抛出 ，那么运行结果将会是 y =11，而 x=1;


finally代码块中使用 return语旬，使返回值的判断变得复杂，所以避免返回值不
可控，我们不要在 finally代码块中使用 return语句。

### finally方法一定会被执行么？
java中，如果想要执行try中的代码之后，不允许再执行finally中的代码，有以下两种方式：
- 使用System.exit(1)来退出虚拟机
- 把当前执行trycatchfinally代码的线程设置为守护线程

##  .class 文件是什么类型文件
class文件是一种8位字节的二进制流文件



## java中序列化之子类继承父类序列化
父类实现了Serializable，子类不需要实现Serializable

相关注意事项

1. 序列化时，只对对象的状态进行保存，而不管对象的方法；
2. 当一个父类实现序列化，子类自动实现序列化，不需要显式实现Serializable接口；
3. 当一个对象的实例变量引用其他对象，序列化该对象时也把引用对象进行序列化；

并非所有的对象都可以序列化，至于为什么不可以，有很多原因了,比如：

1.安全方面的原因，比如一个对象拥有private，public等field，对于一个要传输的对象，比如写到文件，或者进行rmi传输等等，在序列化进行传输的过程中，这个对象的private等域是不受保护的。
2. 资源分配方面的原因，比如socket，thread类，如果可以序列化，进行传输或者保存，也无法对他们进行重新的资源分配，而且，也是没有必要这样实现。
2,反过来父类未实现Serializable，子类实现了，序列化子类实例的时候，父类的属性是直接被跳过不保存，还是能保存但不能还原？（答案：值不保存）

 

解：父类实现接口后，所有派生类的属性都会被序列化。子类实现接口的话，父类的属性值丢失。

java中序列化之子类继承父类序列化



## 标识符
标识符可以包括这4种字符：字母、下划线、$、数字；开头不能是数字；不能是关键字





## Integer i=new Integer(127);和Integer i=127;的区别
Integer i = 127的时候，使用Java常量池技术，是为了方便快捷地创建某些对象，当你需要一个对象时候，就去这个池子里面找，找不到就在池子里面创建一个。但是必须注意 如果对象是用new 创建的。那么不管是什么对像，它是不会放到池子里的，而是向堆申请新的空间存储。Byte,Short,Integer,Long,Character这5种整型的包装类也只是在对应值在-128到127之间的数时才可使用对象池。超过了就要申请空间创建对象了

```java
    int i1=128;
    Integer i2=128;
    Integer i3=new Integer(128);//自动拆箱
    
    System.out.println(i1==i2);//true
    System.out.println(i1==i3);//true
    
    Integer i5=127;
    Integer i6=127;
    System.out.println(i5==i6);//true
    
    
    Integer i5=127;
    Integer ii5=new Integer(127);
    System.out.println(i5==ii5);//false
    
    Integer i7=new Integer(127);
    Integer i8=new Integer(127);
    System.out.println(i7==i8);//false
```



## 手写单例模式
最好的单例模式是静态内部类，不要写双重检验
```java
private static class LazySomethingHolder {
  public static Something something = new Something();
}

public static Something getInstance() {
  return LazySomethingHolder.something;
}
```





## 为什么线程通信的方法wait(), notify()和notifyAll()被定义在Object类里？

Java的每个对象中都有一个锁(monitor，也可以成为监视器) 并且wait()，notify()等方法用于等待对象的锁或者通知其他线程对象的监视器可用。在Java的线程中并没有可供任何对象使用的锁和同步器。这就是为什么这些方法是Object类的一部分，这样Java的每一个类都有用于线程间通信的基本方法

## Java中wait 和sleep 方法比较

1. 这两个方法来自不同的类分别是Thread和Object  
2. 最主要是sleep方法没有释放锁，而wait方法释放了锁，使得其他线程可以使用同步控制块或者方法。  
3. wait，notify和notifyAll只能在同步控制方法或者同步控制块里面使用，而sleep可以在任何地方使用(使用范围)  
4. sleep必须捕获异常，而wait，notify和notifyAll不需要捕获异常  
  
5. sleep方法属于Thread类中方法，表示让一个线程进入睡眠状态，等待一定的时间之后，自动醒来进入到可运行状态，不会马上进入运行状态，因为线程调度机制恢复线程的运行也需要时间，一个线程对象调用了sleep方法之后，并不会释放他所持有的所有对象锁，所以也就不会影响其他进程对象的运行。但在sleep的过程中过程中有可能被其他对象调用它的interrupt(),产生InterruptedException异常，如果你的程序不捕获这个异常，线程就会异常终止，进入TERMINATED状态，如果你的程序捕获了这个异常，那么程序就会继续执行catch语句块(可能还有finally语句块)以及以后的代码。  
  
- 注意sleep()方法是一个静态方法，也就是说他只对当前对象有效，通过t.sleep()让t对象进入sleep，这样的做法是错误的，它只会是使当前线程被sleep 而不是t线程  
  
7.  wait属于Object的成员方法，一旦一个对象调用了wait方法，必须要采用notify()和notifyAll()方法唤醒该进程;如果线程拥有某个或某些对象的同步锁，那么在调用了wait()后，这个线程就会释放它持有的所有同步资源，而不限于这个被调用了wait()方法的对象。wait()方法也同样会在wait的过程中有可能被其他对象调用interrupt()方法而产生  

## hashCode和equals方法的关系
在有些情况下，程序设计者在设计一个类的时候为需要重写equals方法，比如String类，但是千万要注意，在重写equals方法的同时，必须重写hashCode方法。
也就是说对于两个对象，如果调用equals方法得到的结果为true，则两个对象的hashcode值必定相等；
如果equals方法得到的结果为false，则两个对象的hashcode值不一定不同；
如果两个对象的hashcode值不等，则equals方法得到的结果必定为false；
如果两个对象的hashcode值相等，则equals方法得到的结果未知。

## Object类中有哪些方法
Object是所有类的父类，它有很多类对象会用到的方法

Object方法：equals()、toString()、finalize()、hashCode()、getClass()、clone()、wait()、notify()、notifyAll()
```java
package java.lang;
public class Object {

    private static native void registerNatives();
    static {
        registerNatives();
    }
    // 返回一个对象的运行时类,获得类型的信息。
    public final native Class<?> getClass();
    // 该方法将对象的内存地址进行哈希运算,返回一个int类型的哈希值,是相等对象拥有相同的哈希码,尽量让不等的对象具有不同的哈希码。
    public native int hashCode();
    //指示某个其他对象是否与此对象"相等"。
    public boolean equals(Object obj) {
        return (this == obj);
    }
    //创建并返回此对象的一个副本(复制对象)
    protected native Object clone() throws CloneNotSupportedException;
    //返回该对象的字符串表示。以便用户能够获得一些有关对象状态的基本信息。简单说就是利用字符串来表示对象。
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    //唤醒在此对象监视器上等待的单个线程。
    public final native void notify();
    //唤醒在次对象监视器上等待的所有线程。
    public final native void notifyAll();
    //导致当前的线程等待,直到其他线程调用此对象的notify()方法或notifyAll()方法,或者超过指定的时间量。
    public final native void wait(long timeout) throws InterruptedException;
    //导致当前的线程等待,直到其他线程调用此对象的notify()方法或notifyAll方法,或者其他某个线程中断当前线程,或者已超过某个实际时间量。
    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }
        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }
        if (nanos > 0) {
            timeout++;
        }
        wait(timeout);
    }
    //导致当前的线程等待,直到其他线程调用此对象的notify()方法或notifyAll()方法。
    public final void wait() throws InterruptedException {
        wait(0);
    }
    //当垃圾回收器确定不存在对该对象的更多引用时，对象的垃圾回收器调用该方法。
    protected void finalize() throws Throwable { }
}
```
## String
### String s=new String("xyz")究竟创建String Object分为两种情况
1. 如果String常理池中，已经创建"xyz"，则不会继续创建，此时只创建了一个对象new String("xyz")；
2. 如果String常理池中，没有创建"xyz"，则会创建两个对象，一个对象的值是"xyz"，一个对象new String("xyz")。

### Java中由substring方法引发的内存泄漏
- 内存溢出（out of memory ）：通俗的说就是内存不够用了，比如在一个无限循环中不断创建一个大的对象，很快就会引发内存溢出。
- 内存泄漏（leak of memory）：是指为一个对象分配内存之后，在对象已经不在使用时未及时的释放，导致一直占据内存单元，使实际可用内存减少，就好像内存泄漏了一样。

substring(int beginIndex, int endndex )是String类的一个方法，但是这个方法在JDK6和JDK7中的实现是完全不同的（虽然它们都达到了同样的效果）。在JDK1.6中不当使用substring会导致严重的内存泄漏问题。
```
String str = "abcdefghijklmnopqrst";
String sub = str.substring(1, 3);
str = null;
```
这段简单的程序有两个字符串变量str、sub。sub字符串是由父字符串str截取得到的，假如上述这段程序在JDK1.6中运行，我们知道数组的内存空间分配是在堆上进行的，那么sub和str的内部char数组value是公用了同一个，也就是上述有字符a~字符t组成的char数组，str和sub唯一的差别就是在数组中其实beginIndex和字符长度count的不同。在第三句，我们使str引用为空，本意是释放str占用的空间，但是这个时候，GC是无法回收这个大的char数组的，因为还在被sub字符串内部引用着，虽然sub只截取这个大数组的一小部分。当str是一个非常大字符串的时候，这种浪费是非常明显的，甚至会带来性能问题，解决这个问题可以是通过以下的方法：
```
String str = "abcdefghijklmnopqrst";
String sub = str.substring(1, 3) + "";
str = null;
```
利用的就是字符串的拼接技术，它会创建一个新的字符串，这个新的字符串会使用一个新的内部char数组存储自己实际需要的字符，这样父数组的char数组就不会被其他引用，令str=null，在下一次GC回收的时候会回收整个str占用的空间。但是这样书写很明显是不好看的，所以在JDK7中，substring 被重新实现了。

在JDK7中改进了substring的实现，它实际是为截取的子字符串在堆中创建了一个新的char数组用于保存子字符串的字符。这样子字符串和父字符串也就没有什么必然的联系了，当父字符串的引用失效的时候，GC就会适时的回收父字符串占用的内存空间。





## 什么是值传递和引用传递
值传递
```java
public class TempTest {

  private void test1(int a) {
    a = 5;
    System.out.println("test1方法中的a=" + a);
  }

  public static void main(String[] args) {
    TempTest t = new TempTest();
    int a = 3;
    t.test1(11);
    System.out.println("main方法中a=" + a);
  }

}
```
test1方法中的a=5
main方法中a=3
值传递：传递的是值的拷贝，传递后就互不相关了
引用传递：传递的是变量所对应的内存空间的地址

```java
public class TempTest {
  private void test1(A a) {
    a.age = 20;
    System.out.println("test1方法中a=" + a.age);
  }

  public static void main(String[] args) {
    TempTest t = new TempTest();
    A a = new A();
    a.age = 10;
    t.test1(a);
    System.out.println("main方法中a=" + a.age);
  }
}

class A {
  public int age = 0;
}
```
test1方法中a=20
main方法中a=20
传递前和传递后都指向同一个引用（同一个内存空间）
如果不互相影响，方法是在test1方法里面新new一个实例就可以了



##  什么是泛型，为什么要使用以及类型擦除
1. 泛型的本质就是“参数化类型”，也就是说所操作的数据类型被指定为一个参数。
创建集合时就指定集合元素的数据类型，该集合只能保存其指定类型的元素，
避免使用强制类型转换。
2. Java 编译器生成的字节码是不包含泛型信息的，泛型类型信息将在 编译处理 时
被擦除，这个过程即 类型擦除。类型擦除可以简单的理解为将泛型 java 代码转
换为普通 java 代码，只不过编译器更直接点，将泛型 java 代码直接转换成普通
java 字节码。

类型擦除的主要过程如下：

1. 将所有的泛型参数用其最左边界（最顶级的父类型）类型替换。
2. 移除所有的类型参数。


##  什么是序列化？为什么要序列化？
序列化，又称为“串化”，可以形象的把它理解为把Java对象内存中的数据采编成一串二进制的数据，然后把这些数据存放在可以可以持久化的数据设备上，如磁盘。当需要还原这些数据的时候，在通过反序列化的过程，把对象又重新还原到内存中。

为什么要将数据序列化？可以从两个方面来解释，一方面是为了方便数据存储，另一方面是为了方便数据的传递。

序列化好处：
1. 方便数据传递，减少了数据丢失率，增强了程序安全性。
2. 有利于数据存储，减少了不必要的内存浪费，节约了资源。
3. 简化了数据库结构，增强了程序的可维护性。


## 反射
反射就是动态加载对象，并对对象进行剖析。在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法，这种动态获取信息以及动态调用对象方法的功能成为Java反射机制
```java
 Class<?> clz = Class.forName("fs.Student");
 Student stu = (Student) clz.newInstance();
```

### 优点
-  反射提高了程序的灵活性和扩展性,在底层框架中用的比较多，业务层面的开发过程中尽量少用。

### 缺点
1. 性能问题。反射包括了一些动态类型，所以 JVM 无法对这些代码进行优化。因此，反射操作的效 率要比那些非反射操作低得多。我们应该避免在经常被 执行的代码或对性能要求很高的程 序中使用反射。
2. 安全限制。反射要求程序必须在一个没有安全限制的环境中运行。如果一个程序必须在有 安全限制的环境中运行，如 Applet
3. 内部暴露。由于反射允许代码执行一些在正常情况下不被允许的操作（比如访问私有的属性和方 法），所以使用反射可能会导致意料之外的副作用－－代码有功能上的错误，降低可移植性。 反射代码破坏了抽象性。


## Java1.0-1.12各个版本的新特性
**Version 1.0      1996-01-23 Oak(橡树)**
- 提供了一个解释执行的 Java 虚拟机；
- Applet 能在 Mozilla 浏览器中运行。

**JDK Version 1.1     1997-02-19 **
- JDBC(Java DataBase Connectivity);
- 支持内部类;
- RMI(Remote Method Invocation) ;
- 反射;
- Java Bean;

Java 语言的基本形态基本确定了，比如反射 (reflection), JavaBean, 接口和类的关系等等，一直到今天都保持一致

**JDK Version 1.2    1998-12-08 Playground(操场)**
- 集合框架;
- JIT(Just In Time)编译器;
- 对打包的Java文件进行数字签名;
- JFC(Java Foundation Classes), 包括Swing 1.0, 拖放和Java2D类库;
- Java插件;
- JDBC中引入可滚动结果集,BLOB,CLOB,批量更新和用户自定义类型;
- Applet中添加声音支持.

Java 第一个里程碑式的版本。JIT（Just in time）编译器技术，使得语言的可迁移性和执行效率达到最优的平衡，同时 Collections 集合类设计优良，在企业应用开发中迅速得到了广泛使用。


**JDK Version 1.3   2000-05-08 Kestrel(红隼)**
- Java Sound API;
- jar文件索引;
- 对Java的各个方面都做了大量优化和增强;


**JDK Version 1.4    2004-02-06 Merlin(隼)**
- XML处理;
- Java打印服务;
- Logging API;
- Java Web Start;
- JDBC 3.0 API;
- 断言;
- Preferences API;
- 链式异常处理;
- 支持IPV6;
- 支持正则表达式;
- 引入Imgae I/O API.

Java 语言真正走向成熟，提供了非常完备的语言特性，如 NIO，正则表达式，XML 处理器等。

**JAVA 5  2004-09-30 Tiger(老虎)**
- 泛型;
- 增强循环,可以使用迭代方式;
- 自动装箱与自动拆箱;
- 类型安全的枚举;
- 可变参数;
- 静态引入;
- 元数据(注解);
- Instrumentation;

这个版本发生很大的变化，如注解 (Annotation)，装箱 (Autoboxing)，泛型 (Generic)，枚举 (Enum)，foreach 等被加入，提供了 java.util.concurrent 并发包。

**JAVA 6  2006-12-11 Mustang(野马)**
- 支持脚本语言;
- JDBC 4.0API;
- Java Compiler API;
- 可插拔注解;
- 增加对Native PKI(Public Key Infrastructure), Java GSS(Generic Security Service),Kerberos和LDAP(Lightweight Directory Access Protocol)支持;
- 继承Web Services;




**JAVA 7 2011-07-28 Dolphin(海豚)**
- switch语句块中允许以字符串作为分支条件;
- 在创建泛型对象时应用类型推断;
- 在一个语句块中捕获多种异常;
- 支持动态语言;
- 支持try-with-resources(在一个语句块中捕获多种异常);
- 引入Java NIO.2开发包;
- 数值类型可以用二进制字符串表示,并且可以在字符串表示中添加下划线;
- 钻石型语法(在创建泛型对象时应用类型推断);
- null值得自动处理;

这个版本中最引人注目的便是 NIO2 和 Fork/Join 并发包

**JAVA 8 2014-03-18**
- Lambda 表达式 − Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中。
- 方法引用 − 方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
- 默认方法 − 默认方法就是一个在接口里面有了一个实现的方法。
- 新工具 − 新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps。
- Stream API −新添加的Stream API（java.util.stream） 把真正的函数式编程风格引入到Java中。
- Date Time API − 加强对日期与时间的处理。
- Optional 类 − Optional 类已经成为 Java 8 类库的一部分，用来解决空指针异常。
- Nashorn, JavaScript 引擎 − Java 8提供了一个新的Nashorn javascript引擎，它允许我们在JVM上运行特定的javascript应用。

这个版本中最引人注目的便是 Lambda 表达式了，从此 Java 语言原生提供了函数式编程能力


**JAVA 9   2017-09-22**
- 模块系统：模块是一个包的容器，Java 9 最大的变化之一是引入了模块系统（Jigsaw 项目）。
- REPL (JShell)：交互式编程环境。
- 默认的垃圾回收器 —— G1
- HTTP 2 客户端：HTTP/2标准是HTTP协议的最新版本，新的 HTTPClient API 支持 WebSocket 和 HTTP2 流以及服务器推送特性。
- 改进的 Javadoc：Javadoc 现在支持在 API 文档中的进行搜索。另外，Javadoc 的输出现在符合兼容 HTML5 标准。
- 多版本兼容 JAR 包：多版本兼容 JAR 功能能让你创建仅在特定版本的 Java 环境中运行库程序时选择使用的 class 版本。
- 集合工厂方法：List，Set 和 Map 接口中，新的静态工厂方法可以创建这些集合的不可变实例。
- 私有接口方法：在接口中使用private私有方法。我们可以使用 private 访问修饰符在接口中编写私有方法。
- 进程 API: 改进的 API 来控制和管理操作系统进程。引进 java.lang.ProcessHandle 及其嵌套接口 Info 来让开发者逃离时常因为要获取一个本地进程的 PID 而不得不使用本地代码的窘境。
- 改进的 Stream API：改进的 Stream API 添加了一些便利的方法，使流处理更容易，并使用收集器编写复杂的查询。
- 改进 try-with-resources：如果你已经有一个资源是 final 或等效于 final 变量,您可以在 try-with-resources 语句中使用该变量，而无需在 try-with-resources 语句中声明一个新变量。
- 改进的弃用注解 @Deprecated：注解 @Deprecated 可以标记 Java API 状态，可以表示被标记的 API 将会被移除，或者已经破坏。
- 改进钻石操作符(Diamond Operator) ：匿名类可以使用钻石操作符(Diamond Operator)。
- 改进 Optional 类：java.util.Optional 添加了很多新的有用方法，Optional 可以直接转为 stream。
- 多分辨率图像 API：定义多分辨率图像API，开发者可以很容易的操作和展示不同分辨率的图像了。
- 改进的 CompletableFuture API ： CompletableFuture 类的异步机制可以在 ProcessHandle.onExit 方法退出时执行操作。
- 轻量级的 JSON API：内置了一个轻量级的JSON API
- 响应式流（Reactive Streams) API: Java 9中引入了新的响应式流 API 来支持 Java 9 中的响应式编程。

这个版本中最引人注目的时候模块化和默认垃圾回收器G1，通过这个工作，可以构建更小的运行时环境，只需要包括Java平台中任务依赖的部分。这可以更好地适应云端的开发。


**JAVA 10   2018-03-21**
- JEP286: var 局部变量类型推断。
- JEP296: 将原来用 Mercurial 管理的众多 JDK 仓库代码，合并到一个仓库中，简化开发和管理过程。
- JEP304: 统一的垃圾回收接口。
- JEP307: G1 垃圾回收器的并行完整垃圾回收，实现并行性来改善最坏情况下的延迟。
- JEP310: 应用程序类数据 (AppCDS) 共享，通过跨进程共享通用类元数据来减少内存占用空间，和减少启动时间。
- JEP312: ThreadLocal 握手交互。在不进入到全局 JVM 安全点 (Safepoint) 的情况下，对线程执行回调。优化可以只停止单个线程，而不是停全部线程或一个都不停。
- JEP313: 移除 JDK 中附带的 javah 工具。可以使用 javac -h 代替。
- JEP314: 使用附加的 Unicode 语言标记扩展。
- JEP317: 能将堆内存占用分配给用户指定的备用内
- JEP317: 使用 Graal 基于 Java 的编译器，可以预先把 Java 代码编译成本地代码来提升效能。
- JEP318: 在 OpenJDK 中提供一组默认的根证书颁发机构证书。开源目前 Oracle 提供的的 Java SE 的根证书，这样 OpenJDK 对开发人员使用起来更方便。
- JEP322: 基于时间定义的发布版本，即上述提到的发布周期。版本号为\$FEATURE.\$INTERIM.\$UPDATE.\$PATCH，分j别是大版本，中间版本，升级包和补丁版本。


**JAVA 11   2018-09-25**
- 181:Nest-Based访问控制
- 309:动态类文件常量
- 315:改善Aarch64 intrinsic
- 318:无操作垃圾收集器
- 320:消除Java EE和CORBA模块
- 321:HTTP客户端(标准)
- 323:局部变量的语法λ参数
- 324:Curve25519和Curve448关键协议
- 327:Unicode 10
- 328:飞行记录器
- 329:ChaCha20和Poly1305加密算法
- 330:发射一列纵队源代码程序
- 331:低开销堆分析
- 332:传输层安全性(Transport Layer Security,TLS)1.3
- 333:动作:一个可伸缩的低延迟垃圾收集器 (实验)
- 335:反对Nashorn JavaScript引擎
- 336:反对Pack200工具和API



**JAVA 12   2018-09-25 **
- 189: Shenandoah: A Low-Pause-Time Garbage Collector (Experimental) ：新增一个名为 Shenandoah 的垃圾回收器，它通过在 Java 线程运行的同时进行疏散 
(evacuation) 工作来减少停顿时间。
- 230: Microbenchmark Suite：新增一套微基准测试，使开发者能够基于现有的 Java Microbenchmark Harness（JMH）轻松测试 JDK 的性能，并创建新的基准测试。
- 325: Switch Expressions (Preview) ：对 switch 语句进行扩展，使其可以用作语句或表达式，简化日常代码。
- 334: JVM Constants API ：引入一个 API 来对关键类文件 (key class-file) 和运行时工件的名义描述（nominal descriptions）进行建模，特别是那些可从常量池加载的常量。
- 340: One AArch64 Port, Not Two ：删除与 arm64 端口相关的所有源码，保留 32 位 ARM 移植和 64 位 aarch64 移植。
- 341: Default CDS Archives ：默认生成类数据共享（CDS）存档。
- 344: Abortable Mixed Collections for G1 ：当 G1 垃圾回收器的回收超过暂停目标，则能中止垃圾回收过程.
- 346: Promptly Return Unused Committed Memory from G1 ：改进 G1 垃圾回收器，以便在空闲时自动将 Java 堆内存返回给操作系统。





