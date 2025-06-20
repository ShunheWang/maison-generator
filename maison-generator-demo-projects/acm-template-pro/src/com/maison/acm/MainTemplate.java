package com.maison.acm;

import java.util.Scanner;

/**
 * ACM 输入模板（多数之和）
 * @author maison 1. 增加注释
 */
public class MainTemplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. 可选是否循环
//        while (scanner.hasNext()) {
            // 读取输入元素个数
            int n = scanner.nextInt();

            // 读取数组
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // 处理问题逻辑，根据需要进行输出
            // 示例：计算数组元素的和
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }

            // 3. 输出信息可以修改
            System.out.println("结果: " + sum);
//        }

        scanner.close();
    }
}
