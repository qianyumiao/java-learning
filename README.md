# Java 学习记录

> 2026 年秋，从零开始学 Java 的练习代码，分两段：
> 9 月底到 10 月中是手写的单文件练习（`basics/`、`oop/`），10 月中之后换成 IntelliJ 多模块工程（`javastudy/`）。
> 这个仓库不只放"对的答案"，也保留了当时**写错、编译不过、跑起来才炸**的版本。

## 为什么保留错误版本

学习过程里最值钱的不是最后那段能跑的代码，而是"我原来错在哪"。所以每个练习尽量分成：

- `before/` —— 当时写的原始版本，可能编译都过不去
- `after/` —— 后来改对的版本

`before` 里的错误是真实发生过的，不是编出来的例子；每个坑的报错信息都写在下面的[踩坑记录](#踩坑记录实测)里。

## 目录

```
java-learning/
├── basics/                          ① 语法与控制结构
│   ├── 01-loop/Test07.java          三种循环 + continue/break
│   ├── 02-exhaustive/Test11.java    穷举法解方程、百钱买百鸡
│   ├── 03-grade-switch/             成绩等级：switch 的层层踩坑
│   │   ├── before/                  Test05 → Step1 → Step2 → Step3，改了四版
│   │   └── after/                   Test05Fixed + Demo 对照表
│   ├── 04-method/                   方法、参数传递
│   │   ├── v1/                      返回值与不可达代码
│   │   └── v2/                      两数交换：基本类型 vs 数组
│   └── 05-array/                    数组工具类 Arrays
├── oop/                             ① 面向对象（手写单文件）
│   ├── 01-student/                  封装、getter/setter 校验
│   │   ├── v1/                      第一版（构造器调用顺序有问题）
│   │   └── v2/                      修正版
│   ├── 02-pizza/                    继承、多态、简单工厂
│   │   ├── before/                  把菜单编号当披萨名，直接 NPE
│   │   └── after/                   解析编号 + 单一 Scanner + 空值检查
│   └── 03-inner-class/              成员内部类、静态嵌套类、局部类
└── javastudy/Test01/                ② IntelliJ 多模块工程（可直接用 IDEA 打开）
    ├── Test01.iml                   工程根模块
    ├── .idea/                       只保留 modules / encodings / misc 三个配置
    ├── Test/                        Date、Calendar、手写 LinkedList、披萨店
    ├── TestCommonClass/             集合框架、泛型、比较器、String、包
    ├── TestException/               自定义异常
    └── TestOOP01 … TestOOP05/       封装 → 继承 → 接口 → 多态 → 抽象类/内部类
```

## 时间线

| 日期 | 主题 | 目录 |
|---|---|---|
| 09-27 | `for` / `while` / `do-while`，`switch` 分支 | `basics/03-grade-switch` |
| 09-28 | 循环控制 `continue`、累加与累乘 | `basics/01-loop` |
| 09-30 | 穷举法：二元一次方程、百钱买百鸡 | `basics/02-exhaustive` |
| 10-02 | 方法定义、返回值、参数传递 | `basics/04-method/v1` |
| 10-03 | 两数交换为什么"传不过去" | `basics/04-method/v2` |
| 10-04 | `Arrays` 工具类 | `basics/05-array` |
| 10-09 | 封装、构造器、setter 里做校验 | `oop/01-student` |
| 10-14 | 内部类：成员 / 静态 / 局部 | `oop/03-inner-class` |
| 10-15 | 继承、多态、工厂方法 | `oop/02-pizza` |
| 10-17 | 换用 IntelliJ，开始多模块练习 | `javastudy/Test01/TestOOP01` |
| 10-19 | 异常、自定义异常、`Date` / `Calendar` | `TestException`、`Test` |
| 10-21 | `String` / `StringBuilder` | `TestCommonClass/testString` |
| 10-24 | `List`、`LinkedList`、泛型 | `TestCommonClass/testcollection*` |
| 10-27 | `Set`、`TreeSet`、`Comparable` | `TestCommonClass/testcollection03` |
| 10-28 | 外部比较器 `Comparator`、内部比较器对比 | `testinnercompare` / `testoutercompare` |
| 10-29 | `Map`、`HashMap`、`TreeMap`、多字段排序 | `TestCommonClass/testcollection04` |

（第二阶段日期取自文件修改时间，`javastudy/` 里的模块名是当时按顺序起的，不代表主题。）

## 几个印象最深的练习

### 成绩等级：一个 `switch` 改了四版

题目是"输入成绩，输出等级"。`before/` 里躺着四份文件，是同一道题的四次尝试：

| 文件 | 状态 | 卡在哪 |
|---|---|---|
| `Test05.java` | 编译失败 | `import java.util*;` 少了点号；`Math.randon()` 拼错 |
| `Step1.java` | 编译失败 | 修了 import，`Math.randon()` 还在 |
| `Step2.java` | 编译失败 | 随机数改对了，但把 `if` 写进了 `switch` 的最后一个 case，成了不可达语句 |
| `Step3.java` | 能编译 | 把及格判断挪出 `switch` |
| `after/Test05Fixed.java` | 能编译 + 重构 | 合并 `case`，补上 `case 0`，`default` 兜住非法输入 |

`after/Demo.java` 是个小工具：把 1、5、9、10、59、60、66、100、101 这些边界分数一次性喂进去，并排打印结果。写这个是因为当时不信"case 漏了会怎样"，跑一遍就看见了——0~9 分根本不进任何 case。

### 两数交换：方法改了，调用方没变

`v2/before/Test12.java` 里：

```java
public static int changeNum(int num1, int num2){
    int i = num1;
    num1 = num2;
    num2 = i;
    return num1,num2;      // 语法就不对
}
```

即使把 `return` 改对，`main` 里的 `num1`、`num2` 也不会变——Java 只有值传递，方法拿到的是副本。`after/` 改成传数组，方法内改的是同一个数组对象，这才看得见效果。

### 披萨店：编译通过，一跑就空指针

`oop/02-pizza/before` 是完整的继承 + 工厂：`Pizza` 基类，`FruitPizza` / `BaconPizza` 继承它，`PizzaMaker.make()` 按名字造对象，`Test` 里多态调用 `showPizza()`。

能编译，但运行输入 `1` 之后：

```
您录入信息有误，请重试！
Exception in thread "main" java.lang.NullPointerException:
Cannot invoke "com.qianyu.testpizza.Pizza.showPizza()" because "<local3>" is null
```

原因：`Test` 把用户输入的**菜单编号 `"1"`** 直接当成披萨名传给了 `make()`，而 `make()` 里的 `switch` 只认 `"水果披萨"` / `"培根披萨"`，落到 `default` 返回 `null`，下一行就解引用了。

`after/` 修了三处：把编号解析成名字、整个程序只用一个 `Scanner`、工厂返回 `null` 时先判断再调用。现在输入 `1` → `12` → `芒果`，输出：

```
您好，您点的12英寸的水果披萨好了，价格是90元。
您加入的水果为：芒果
```

### 内部类：局部类的名字出不了方法

`oop/03-inner-class` 里 `TestClass` 同时有成员内部类 `A`、静态嵌套类 `B`、以及方法体里的局部类 `a`。局部类只能以 `Comparable` 这种父类型"逃"出方法，想调它自己的 `c()` 只能反射。`Main.java` 把三种写法和 `this` 的三层指向（局部变量 → 内部类字段 → 外部类字段）都跑了一遍。

## 第二阶段：IntelliJ 多模块工程

10 月中换成 IDEA 之后，练习按模块分开，一个模块一个主题。`javastudy/Test01` 是**原样的 IDEA 工程**——`*.iml` 和 `.idea/modules.xml` 都提交了，里面的路径全是 `$MODULE_DIR$` 相对路径，clone 下来直接 `File → Open` 就能用，8 个模块都能跑。

| 模块 | 主题 | 主要内容 |
|---|---|---|
| `TestOOP01` | 包与访问权限 | 同一个 `Person` 在 `com.qianyu`、`qianyu2`、`qianyu4` 里各写一份，看 `public` / 默认 / `private` 的实际差别 |
| `TestOOP02` | 继承 | `Student extends Person`，构造器与 `super` |
| `TestOOP03` | 封装 | `Phone` 属性私有化 + 校验 |
| `TestOOP04` | 多态 | 餐厅点单（`Restaurant` / `Menu` / `Guest`）、`Boy` / `Girl` / `Mom` |
| `TestOOP05` | 接口 / 抽象类 / 内部类 | `Interface01` + `Animals` / `Cat` / `Dog` / `PetStore`；抽象类 `Person`；成员内部类 `TestOuter` |
| `TestException` | 异常 | 默认包里的 `TestException`；`TestException02` 里带自定义异常的 `Person` / `Student` |
| `Test` | 常用类 | `Date` / `SimpleDateFormat` / `Calendar`；手写 `MyLinkedlist` + `Node`；披萨店重写一遍 |
| `TestCommonClass` | 集合框架 | `List` / `LinkedList` / `Set` / `TreeSet` / `Map` / `HashMap` / `TreeMap`、泛型、`Comparable` vs `Comparator`、`String` / `StringBuilder`、包 |

这 8 个模块**全部实测编译通过**（`javac -encoding UTF-8`，JDK 25）。和第一阶段那些"故意留着报错"的文件不同，这一批是能跑的。

两个值得说的点：

- `testinnercompare` 与 `testoutercompare` 是同一个 `Student` 的两种排序写法。前者 `implements Comparable<Student>` 把规则焊在类里，只此一种；后者拆成 `BiJiaoAge` / `BiJiaoHeight` / `BiJiaoName` 三个 `Comparator`，`TreeMap`、`TreeSet` 都能吃。需求一改就能看出差别——加一种排序不用动 `Student`。
- `TestCommonClass/testcollection03/Student.java` 里两种比较方式同时存在，`TreeSet<Student>` 用自定义比较器排序；而 `Test` 模块里干脆手写了 `MyLinkedlist`（`Node` + 指针），用来对照 `java.util.LinkedList` 内部到底在做什么。

## 踩坑记录（实测）

| 现象 | 原因 | 修法 |
|---|---|---|
| `javac` 报 `需要';'` | `import java.util*;` 少了 `.`；`System.out.println{...}` 用了花括号 | 写成 `java.util.*`、`println(...)` |
| `找不到符号: 方法 randon()` | 拼写错误 | `Math.random()` |
| `无法访问的语句` | `return` 之后还有代码；`switch` 某个 case 里所有分支都 `break` 了，后面还挂了语句 | 删掉死代码，把逻辑挪出 `switch` |
| `缺少返回语句` | `switch` 覆盖不全，`return` 之后没有兜底 `return` | 加 `default` 或末尾 `return` |
| 程序跑起来 `NullPointerException` | 工厂方法 `switch` 没匹配上，返回了 `null`，调用方没判空 | 校验参数，返回前判空 |
| 方法里交换了两个数，`main` 里没变 | 基本类型是值传递 | 传数组/对象，或把结果 `return` 回去 |
| 累乘结果是负数 | `int` 溢出（奇数的阶乘增长极快） | 用 `long`/`BigInteger`，或只累加到合理范围 |
| `找不到 main 方法` | `static void main` 少了 `public` | 补上 `public`（JDK 25 起放宽了这条，旧版 JDK 会报错） |
| 目录 `Test1` 但 `package com.qianyu.test1` | 包名大小写和目录名不一致 | 统一成小写 `test1` |

最后一条来自 `oop/01-student/v1`：当时文件夹写成 `Test1`，包声明却是 `test1`。Windows 不区分大小写所以能编译，换到 Linux 上就找不到了。

## 怎么运行

需要 JDK（全部代码在 JDK 25 上验证过）。没有构建工具，`javac` + `java` 就够；`javastudy/` 那部分也可以直接用 IDEA 打开。

**默认包里的单个文件**（`basics/` 下大多是这种）：

```bash
cd basics/01-loop
javac -encoding UTF-8 -d out Test07.java
java -cp out Test07
```

**带 package 的**（`oop/` 下），在整个版本目录里一起编译：

```bash
cd oop/02-pizza/after
javac -encoding UTF-8 -d out $(find . -name "*.java")     # Windows PowerShell 用：
# javac -encoding UTF-8 -d out (Get-ChildItem -Recurse -Filter *.java).FullName
java -cp out com.qianyu.testpizza.Test
```

**`javastudy/` 的模块**，一个模块一个来源根，编译时要带上该模块 `src` 下的全部文件：

```bash
cd javastudy/Test01/TestCommonClass
javac -encoding UTF-8 -d out $(find src -name "*.java")
java -cp out com.qianyu.testcollection04.TestMap
```

用 IDEA 的话更省事：`File → Open` 选 `java-learning/javastudy/Test01`，等它建立索引，各模块的 `src` 已经配好，右键任意带 `main` 的类直接 Run。

`-encoding UTF-8` 不能省，源码里有中文，Windows 默认编码不是 UTF-8 时会乱码或编译报错。

注意 `before/` 里的文件是**故意留着编译不过的**，想跑请用 `after/`。

## 说明

- 代码是学习过程中的原样记录，风格不统一，注释有口语，属于正常现象。
- `04-method/v1` 和 `v2` 里都有 `Test12` 类，是同一道题的两次迭代，请**分开编译**，不要一次性 `javac` 整个 `basics/`。
- `javastudy/Test01` 的 8 个模块里也有同名类（`com.qianyu.test1.Student` 在好几个模块出现），原因同上：**一个模块一次编译**，别把 `javastudy/` 整个丢给 `javac`。
- `out/`、`*.class`、`.idea/workspace.xml` 这类东西都在 `.gitignore` 里，不会进仓库；`.iml` 和 `.idea/{modules,encodings,misc}.xml` 是有意提交的，为了让工程 clone 下来就能打开。

## License

[MIT](LICENSE)
