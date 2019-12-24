# Android_MVC_MVP_MVVM
Android大型项目中，为了达到模块内部的高聚合和模块间的低耦合性，提高项目的可维护性和可扩展性，我们通常会使用一种框架模型，该项目主要带大家认识学习Android的MVC-MVP-MVVM三种框架模型。在项目中除了会对比介绍每个模型的优缺点，还会结合代码案例来解析每个模型的使用。

# 本项目你能学到什么？
 **1.MVC、MVP、MVVM的基本概念**<br />
 **2.MVC、MVP、MVVM的优缺点及区别**<br />
 **3.DataBinding的基本使用**<br />
 **4.如何使用MVC、MVP、MVVM实现项目需求**

## MVC
MVC：全名 Model View Controller 即模型-视图-控制器<br />
Controller：Activity 、Fragment<br />
View: layout、view控件<br />
Model:数据处理，一些网络请求，数据库操作<br />
Controller->Model->View 循环不断<br />
优点：一定程度上实现了Model与View的分离，降低了代码的耦合性<br />
缺点：Controller与View难以完全解耦，并且随着项目复杂度的提升，Controller将越来越臃肿。因为在安卓Activity即使控制器，也要承担部分view视图层的操作

## MVP
MVP：Model-View-Presenter<br />
Model：数据工作，负责提供View层面的功能(采用实现接口的方式，提供给P层)<br />
View：视图工作，在Android指的是Activity、Fragment，负责提供数据方面的功能<br />
Presenter：主要工作是连接Model和View的纽带，因Model与View不再之间通信，P层来进行V与M互相通信,所以P层需要持有M层和V层的引用<br />
Model↔Controller↔View<br />
优点：解决了MVC中Controller与View过度耦合的缺点，职责划分明显，更加易于维护<br />
缺点：接口数量多，项目复杂度升高。随着项目复杂度的提升，Presenter层将越来越臃肿
### 与mvc差别：
①Model与View不再直接进行通信，而是通过中间层Presenter来实现<br />
②Activity的功能被简化，不再充当控制器，主要负责View层面的工作

## MVVP
 MVVM：Model-View-ViewModel简写，MVVM在MVP基础上实现了数组视图的绑定（DataBinding），当数据变化时，视图会自动更新，反之视图发生变化时，数据也会自动更新<br />
 优点：实现了数据和视图的双向绑定，极大的简化代码<br />
 缺点：bug难以调试，并且dataBing目前还存在一些编译问题