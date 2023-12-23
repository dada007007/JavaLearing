//
import type { DeptModel, ResultModel } from './model/model.js'
import request from '../utils/request.js'

//1.查询所有部门
export const queryAllDept = ()=>request.get<any,ResultModel>('/depts')

//2.新增部门
export const addApi = (dept:DeptModel)=>request.post<any,ResultModel>('/depts',dept)

//3.根据id查询
export const getInfoApi = (id:number)=>request.get<any,ResultModel>(`/depts/${id}`)

//4.修改部门
export const updateApi = (dept:DeptModel)=>request.put<any,ResultModel>('/depts',dept)

//5.删除部门
export const deleteApi = (id:number)=>request.delete<any,ResultModel>(`/depts?id=${id}`)