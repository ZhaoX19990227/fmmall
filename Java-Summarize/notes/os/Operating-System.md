<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [进程有哪些状态](#%E8%BF%9B%E7%A8%8B%E6%9C%89%E5%93%AA%E4%BA%9B%E7%8A%B6%E6%80%81)
- [进程间通信方式](#%E8%BF%9B%E7%A8%8B%E9%97%B4%E9%80%9A%E4%BF%A1%E6%96%B9%E5%BC%8F)
- [内核态与用户态](#%E5%86%85%E6%A0%B8%E6%80%81%E4%B8%8E%E7%94%A8%E6%88%B7%E6%80%81)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->


## 进程有哪些状态
一般来说，进程有三个状态，即就绪状态，运行状态，阻塞状态。

1. 运行态：进程占用CPU，并在CPU上运行
2. 就绪态：进程已经具备运行条件，但是CPU还没有分配过来
3. 阻塞态：进程因等待某件事发生而暂时不能运行
![](https://github.com/zaiyunduan123/Java-Interview/blob/master/image/os-1.jpg)

当然理论上上述三种状态之间转换分为六种情况；

1. 运行——>就绪：1，主要是进程占用CPU的时间过长，而系统分配给该进程占用CPU的时间是有限的；2，在采用抢先式优先级调度算法的系统中,当有更高优先级的进程要运行时，该进程就被迫让出CPU，该进程便由执行状态转变为就绪状态。
2. 就绪——>运行：运行的进程的时间片用完，调度就转到就绪队列中选择合适的进程分配CPU
3. 运行——>阻塞：正在执行的进程因发生某等待事件而无法执行，则进程由执行状态变为阻塞状态，如发生了I/O请求
4. 阻塞——>就绪:进程所等待的事件已经发生，就进入就绪队列

 
以下两种状态是不可能发生的：

1. 阻塞——>运行：即使给阻塞进程分配CPU，也无法执行，操作系统在进行调度时不会从阻塞队列进行挑选，而是从就绪队列中选取

2. 就绪——>阻塞：就绪态根本就没有执行，谈不上进入阻塞态。

## 进程间通信方式
1. 管道pipe：管道是一种半双工的通信方式，数据只能单向流动，而且只能在具有亲缘关系的进程间使用。进程的亲缘关系通常是指父子进程关系。
2. 命名管道FIFO：有名管道也是半双工的通信方式，但是它允许无亲缘关系进程间的通信。
4. 消息队列MessageQueue：消息队列是由消息的链表，存放在内核中并由消息队列标识符标识。消息队列克服了信号传递信息少、管道只能承载无格式字节流以及缓冲区大小受限等缺点。
5. 共享存储SharedMemory：共享内存就是映射一段能被其他进程所访问的内存，这段共享内存由一个进程创建，但多个进程都可以访问。共享内存是最快的 IPC 方式，它是针对其他进程间通信方式运行效率低而专门设计的。它往往与其他通信机制，如信号两，配合使用，来实现进程间的同步和通信。
6. 信号量Semaphore：信号量是一个计数器，可以用来控制多个进程对共享资源的访问。它常作为一种锁机制，防止某进程正在访问共享资源时，其他进程也访问该资源。因此，主要作为进程间以及同一进程内不同线程之间的同步手段。
7. 套接字Socket：套解口也是一种进程间通信机制，与其他通信机制不同的是，它可用于不同及其间的进程通信。
8. 信号 ( sinal ) ： 信号是一种比较复杂的通信方式，用于通知接收进程某个事件已经发生。




## 内核态与用户态
内核态: CPU可以访问内存所有数据, 包括外围设备, 例如硬盘, 网卡. CPU也可以将自己从一个程序切换到另一个程序
用户态: 只能受限的访问内存, 且不允许访问外围设备. 占用CPU的能力被剥夺, CPU资源可以被其他程序获取
为什么要有用户态和内核态

由于需要限制不同的程序之间的访问能力, 防止他们获取别的程序的内存数据, 或者获取外围设备的数据, 并发送到网络, CPU划分出两个权限等级 -- 用户态 和 内核态
用户态与内核态的切换

所有用户程序都是运行在用户态的, 但是有时候程序确实需要做一些内核态的事情, 例如从硬盘读取数据, 或者从键盘获取输入等. 而唯一可以做这些事情的就是操作系统, 所以此时程序就需要先操作系统请求以程序的名义来执行这些操作.
这时需要一个这样的机制: 用户态程序切换到内核态, 但是不能控制在内核态中执行的指令
这种机制叫系统调用, 在CPU中的实现称之为陷阱指令(Trap Instruction)
他们的工作流程如下:
1. 用户态程序将一些数据值放在寄存器中, 或者使用参数创建一个堆栈(stack frame), 以此表明需要操作系统提供的服务.
2. 用户态程序执行陷阱指令
3. CPU切换到内核态, 并跳到位于内存指定位置的指令, 这些指令是操作系统的一部分, 他们具有内存保护, 不可被用户态程序访问
4. 这些指令称之为陷阱(trap)或者系统调用处理器(system call handler). 他们会读取程序放入内存的数据参数, 并执行程序请求的服务
5. 系统调用完成后, 操作系统会重置CPU为用户态并返回系统调用的结果
