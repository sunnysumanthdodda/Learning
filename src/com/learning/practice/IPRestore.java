/*
A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.
[1:05 PM] Sachin Ladhad
Example 1:
Input: s = "25525511135"Output: ["255.255.11.135","255.255.111.35"]
Example 2:
Input: s = "0000"Output: ["0.0.0.0"]
Example 3:
Input: s = "101023"Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
*/

package com.learning.practice;

import java.util.*;


public class IPRestore {

    public static List<String> restoreIp(String s) {
        List<String> res = new ArrayList<>();
        util(s, 0, "", res, 0);
        return res;
    }

    private static void util(String s, int idx, String cip, List<String> res, int dots) {

        if (dots > 4)
            return;

        if (dots == 4 && idx == s.length()) {
            res.add(cip.substring(0, cip.length() - 1));
            return;
        }

        for (int i = 1; i < 4; i++) {
            if (idx + i > s.length())
                break;

            String part = s.substring(idx, idx + i);
            if ((part.startsWith("0") && part.length() > 1) || (i == 3 && Integer.parseInt(part) > 255))
                continue;
            util(s, idx + i, cip + part + ".", res, dots + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(restoreIp("25525511135"));
    }
}
