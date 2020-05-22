# LeetCode 每日一题

* [简单(Easy)](#%E7%AE%80%E5%8D%95simple)
   * [两数之和(TwoNumSum)](#%E4%B8%A4%E6%95%B0%E4%B9%8B%E5%92%8Ctwonumsum)
   * [整数反转(IntegerInversion)](#%E6%95%B4%E6%95%B0%E5%8F%8D%E8%BD%ACintegerinversion)
   * [回文数(Palindrome)](#%E5%9B%9E%E6%96%87%E6%95%B0palindrome)
   * [罗马数字转整数(RomanToInt)](#%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97%E8%BD%AC%E6%95%B4%E6%95%B0romantoint)
   * [最长公共前缀(LongestCommonPrefix)](#%E6%9C%80%E9%95%BF%E5%85%AC%E5%85%B1%E5%89%8D%E7%BC%80longestcommonprefix)
   * [有效的括号(ValidParentheses)](#%E6%9C%89%E6%95%88%E7%9A%84%E6%8B%AC%E5%8F%B7validparentheses)
   * [合并两个有序链表(MergeTwoLists)](#%E5%90%88%E5%B9%B6%E4%B8%A4%E4%B8%AA%E6%9C%89%E5%BA%8F%E9%93%BE%E8%A1%A8mergetwolists)
   * [删除排序数组中的重复项(RemoveDuplicates)](#%E5%88%A0%E9%99%A4%E6%8E%92%E5%BA%8F%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E9%87%8D%E5%A4%8D%E9%A1%B9removeduplicates)
   * [移除元素(RemoveElement)](#%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0removeelement)
   * [匹配字符串(MatchStr)](#%E5%8C%B9%E9%85%8D%E5%AD%97%E7%AC%A6%E4%B8%B2matchstr)
   * [搜索插入位置(SearchInsert)](#%E6%90%9C%E7%B4%A2%E6%8F%92%E5%85%A5%E4%BD%8D%E7%BD%AEsearchinsert)
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

------

#### 最长公共前缀(LongestCommonPrefix)

编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

- 示例 1: 输入: ["flower","flow","flight"], 输出: "fl"
- 示例 2: 输入: ["dog","racecar","car"], 输出: ""
  - 解释: 输入不存在公共前缀。
- 说明:  所有输入只包含小写字母 a-z 。

------

#### 有效的括号(ValidParentheses)

给定一个只包括 `'('`，`')'`，`'{'`，`'}'`，`'['`，`']'` 的字符串，判断字符串是否有效。

有效字符串需满足：

1. 左括号必须用相同类型的右括号闭合。
2. 左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。

- 示例 1: 输入: "()", 输出: true
- 示例 2: 输入: "()[]{}", 输出: true
- 示例 3: 输入: "(]", 输出: false
- 示例 4: 输入: "([)]", 输出: false
- 示例 5: 输入: "{[]}", 输出: true

------

#### 合并两个有序链表(MergeTwoLists)

将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

- 示例 : 输入：1->2->4, 1->3->4,  输出：1->1->2->3->4->4

------

#### 删除排序数组中的重复项(RemoveDuplicates)

给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

**示例 1:**

```
给定数组 nums = [1,1,2], 

函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 

你不需要考虑数组中超出新长度后面的元素。
```

**示例 2:**

```
给定 nums = [0,0,1,1,1,2,2,3,3,4],

函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

你不需要考虑数组中超出新长度后面的元素。
```

**说明:**

```
为什么返回数值是整数，但输出的答案是数组呢?

请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

你可以想象内部操作如下:

// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
int len = removeDuplicates(nums);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
```

------

#### 移除元素(RemoveElement)

给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

**示例 1:**

```
给定 nums = [3,2,2,3], val = 3,

函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。

你不需要考虑数组中超出新长度后面的元素。
```

**示例 2:**

```
给定 nums = [0,1,2,2,3,0,4,2], val = 2,

函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。

注意这五个元素可为任意顺序。

你不需要考虑数组中超出新长度后面的元素。
```

**说明:**

为什么返回数值是整数，但输出的答案是数组呢?

请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

你可以想象内部操作如下:

```
// nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
int len = removeElement(nums, val);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
```

------

#### 匹配字符串(MatchStr)

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

**示例 1:**

```
输入: haystack = "hello", needle = "ll"
输出: 2
```

**示例 2:**

```
输入: haystack = "aaaaa", needle = "bba"
输出: -1
```

**说明:**

当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

------

#### 搜索插入位置(SearchInsert)

给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

**示例 1:**

```
输入: [1,3,5,6], 5
输出: 2
```

**示例 2:**

```
输入: [1,3,5,6], 2
输出: 1
```

**示例 3:**

```
输入: [1,3,5,6], 7
输出: 4
```

**示例 4:**

```
输入: [1,3,5,6], 0
输出: 0
```

------

#### 外观数列(CountAndSay)

「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：

```
1.     1
2.     11
3.     21
4.     1211
5.     111221
```

1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

给定一个正整数 *n*（1 ≤ *n* ≤ 30），输出外观数列的第 *n* 项。

注意：整数序列中的每一项将表示为一个字符串。

**示例 1:**

```
输入: 1
输出: "1"
解释：这是一个基本样例。
```

**示例 2:**

```
输入: 4
输出: "1211"
解释：当 n = 3 时，序列是 "21"，其中我们有 "2" 和 "1" 两组，"2" 可以读作 "12"，也就是出现频次 = 1 而 值 = 2；类似 "1" 可以读作 "11"。所以答案是 "12" 和 "11" 组合在一起，也就是 "1211"。
```

------

#### 最大子序和(MaxSubArray)

给定一个整数数组 `nums` ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

**示例:**

```
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
```

------

