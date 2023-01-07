# Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.

def strings_xor(s, t):
    res = ""
    for i in range(len(s)):
        if s[i] == t[i]:
            res = res+'0';
        else:
            res = res+'1';