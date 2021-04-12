cmake_minimum_required(VERSION 3.17)
project(leetcode)

set(CMAKE_CXX_STANDARD 20)
# 遍历项目根目录下所有的 .cpp 文件
file (GLOB files *.cpp)
add_executable(leetcode main.cpp)
# 遍历项目根目录及二级目录下所有的 .cpp 文件
file (GLOB files *.cpp */*cpp)
foreach (file ${files})
    string(REGEX REPLACE ".+/(.+)\\..*" "\\1" exe ${file})
    add_executable (${exe} ${file})
    message (\ \ \ \ --\ src/${exe}.cpp\ will\ be\ compiled\ to\ bin/${exe})
endforeach ()