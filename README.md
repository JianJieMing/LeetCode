# LeetCode 每日一题

* [简单(Simple)](#%E7%AE%80%E5%8D%95simple)
    * [两数之和(TwoNumSum)](#%E4%B8%A4%E6%95%B0%E4%B9%8B%E5%92%8Ctwonumsum)
    * [整数反转(IntegerInversion)](#%E6%95%B4%E6%95%B0%E5%8F%8D%E8%BD%ACintegerinversion)
    * [回文数(Palindrome)](#%E5%9B%9E%E6%96%87%E6%95%B0palindrome)
    * [罗马数字转整数(RomanToInt)](#%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97%E8%BD%AC%E6%95%B4%E6%95%B0romantoint)
    
------

## 简单(Simple)

#### 两数之和(TwoNumSum)
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

**示例:**

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9

所以返回 [0, 1]

------

#### 整数反转(IntegerInversion)
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

* 示例 1: 输入: 123, 输出: 321

* 示例 2: 输入: -123, 输出: -321

* 示例 3: 输入: 120, 输出: 21

注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

------

#### 回文数(Palindrome)
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

* 示例 1: 输入: 121, 输出: true
* 示例 2: 输入: -121, 输出: false

**解释:** 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

* 示例 3: 输入: 10 输出: false

**解释:** 从右向左读, 为 01 。因此它不是一个回文数。

**进阶:** 你能不将整数转为字符串来解决这个问题吗？

------

#### 罗马数字转整数(RomanToInt)

罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。

| 字符 | 数值 |
| :--: | :--: |
|  I   |  1   |
|  V   |  5   |
|  X   |  10  |
|  L   |  50  |
|  C   | 100  |
|  D   | 500  |
|  M   | 1000 |


例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

- I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。

- X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
- C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

- 示例 1: 输入: "III", 输出: 3
- 示例 2: 输入: "IV", 输出: 4
- 示例 3: 输入: "IX", 输出: 9
- 示例 4: 输入: "LVIII", 输出: 58
  - 解释: L = 50, V= 5, III = 3.

- 示例 5: 输入: "MCMXCIV", 输出: 1994
  - 解释: M = 1000, CM = 900, XC = 90, IV = 4.

