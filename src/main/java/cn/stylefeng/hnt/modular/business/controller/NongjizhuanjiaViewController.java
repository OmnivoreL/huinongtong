package cn.stylefeng.hnt.modular.business.controller;

import cn.stylefeng.roses.kernel.scanner.api.annotation.ApiResource;
import cn.stylefeng.roses.kernel.scanner.api.annotation.GetResource;
import org.springframework.stereotype.Controller;

@Controller
@ApiResource(name = "农技专家相关的界面渲染")
public class NongjizhuanjiaViewController {
    
    /**
     * 农技专家-首页-视图
     */
    @GetResource(name = "农技专家-首页-视图", path = "/view/nongjizhuanjia")
    public String indexView() {
        return "/modular/business/nongjizhuanjia/nongjizhuanjia.html";
    }

    /**
     * 农技专家-添加-视图
     */
    @GetResource(name = "农技专家-添加-视图", path = "/view/nongjizhuanjia/addView")
    public String addView() {
        return "/modular/business/nongjizhuanjia/nongjizhuanjia_add.html";
    }

    /**
     * 农技专家-修改-视图
     */
    @GetResource(name = "农技专家-修改-视图", path = "/view/nongjizhuanjia/editView")
    public String editView() {
        return "/modular/business/nongjizhuanjia/nongjizhuanjia_edit.html";
    }


}
