<script setup lang="ts">
import { ref } from 'vue'
import { Menu as IconMenu,Edit,SwitchButton, UserFilled, HomeFilled, Promotion, Setting, Tools, Histogram, InfoFilled, Share, Document, HelpFilled, Avatar } from '@element-plus/icons-vue'


</script>

<template>
    <el-container class="layout-container-demo" style="height: 500px">
        <el-header style="text-align: left;font-weight:bold; font-family: 楷体;font-size: 30px;color: white;">Tlias智能学习辅助系统
            <div class="toolbar" >
                <el-dropdown>
                    <el-icon style="margin-left:1000px; margin-top: 1px ;margin-right: 5px;">
                        <Edit />
                    </el-icon>
                </el-dropdown>
                <span style="margin-right:20px;font-weight:normal;font-family: 微软雅黑">修改密码</span>
                <span >|</span>
                <el-dropdown>
                    <el-icon style="margin-left:10px; margin-top: 1px;margin-right: 5px;">
                        <SwitchButton />
                    </el-icon>
                </el-dropdown>
                <span style="font-weight:normal;font-family: 微软雅黑">退出登录【宋江】</span>
            </div>
        </el-header>
        <el-container>
        <el-aside width="200px">
            <el-menu>
                <el-menu-item >
                    <el-icon>
                        <Promotion />
                    </el-icon>首页
                  
                </el-menu-item>
            </el-menu>


            <el-menu>
                <el-sub-menu index="2">
                    <template #title>
                        <el-icon><icon-menu /></el-icon>班级学员管理
                    </template>
                    <el-menu-item-group>

                        <el-menu-item index="2-1"><el-icon>
                                <HomeFilled />
                            </el-icon>班级管理</el-menu-item>
                        <el-menu-item index="2-2"><el-icon>
                                <UserFilled />
                            </el-icon>学员管理</el-menu-item>
                    </el-menu-item-group>
                </el-sub-menu>

                <el-sub-menu index="3">
                    <template #title>
                        <el-icon>
                            <Tools />
                        </el-icon>系统信息管理
                    </template>
                    <el-menu-item-group>
                        <el-menu-item index="3-1"><el-icon>
                                <HelpFilled />
                            </el-icon>部门管理</el-menu-item>
                        <el-menu-item index="3-2"><el-icon>
                                <Avatar />
                            </el-icon>员工管理</el-menu-item>
                    </el-menu-item-group>
                </el-sub-menu>

                <el-sub-menu index="4">
                    <template #title>
                        <el-icon>
                            <Histogram />
                        </el-icon>数据统计管理
                    </template>
                    <el-menu-item-group>
                        <el-menu-item index="4-1"><el-icon>
                                <InfoFilled />
                            </el-icon>员工信息统计</el-menu-item>
                        <el-menu-item index="4-2"><el-icon>
                                <Share />
                            </el-icon>学员信息统计</el-menu-item>
                        <el-menu-item index="4-3"><el-icon>
                                <Document />
                            </el-icon>日志信息统计</el-menu-item>
                    </el-menu-item-group>
                </el-sub-menu>
            </el-menu>

        </el-aside>
        <e1-main>
            <img src="../assets/index.png" >

        </e1-main>
        </el-container>
    </el-container>
</template>

<style scoped>
.layout-container-demo .el-header {
    position: relative;
    background: linear-gradient(to right, rgb(143, 87, 204), rgb(212, 124, 228));
    color: var(--el-text-color-primary);
    font-size: smaller;
}

.layout-container-demo .el-menu {
    border-right: none;
}

.layout-container-demo .el-main {
    padding: 0;
}

.layout-container-demo .toolbar {
    display: inline-flex;
    align-items: center;
    font-size: 15px;
    height: 100%;
    right: 20px;
}
</style>