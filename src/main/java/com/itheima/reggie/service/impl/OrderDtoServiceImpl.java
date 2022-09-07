package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.dto.OrderDto;
import com.itheima.reggie.mapper.OrderDtoMapper;
import com.itheima.reggie.service.OrderDtoService;
import org.springframework.stereotype.Service;

@Service
public class OrderDtoServiceImpl extends ServiceImpl<OrderDtoMapper, OrderDto> implements OrderDtoService {
}
