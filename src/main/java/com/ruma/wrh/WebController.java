package com.ruma.wrh;

import com.ruma.wrh.dao.WarehouseDao;
import com.ruma.wrh.dao.WarehouseEntity;
import com.ruma.wrh.dao.WarehouseEntityPK;
import com.ruma.wrh.model.WarehouseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    WarehouseDao warehouseDao;

    @RequestMapping(value = "/warehouse", method = RequestMethod.GET)
    public String wareHouse(Model model,
                            @RequestParam(value = "name", required = false, defaultValue = "") String name) {
        model.addAttribute("name", name);

        List<WarehouseEntity> listItems = warehouseDao.findAll();
        model.addAttribute("warehouseItems", listItems);
        return "warehouse";
    }

    @RequestMapping(value = "/warehouse/add", method = RequestMethod.GET)
    public String loadAddItem(Model model) {
        return "additemwarehouse";
    }

    @RequestMapping(value = "/warehouse/add", method = RequestMethod.POST)
    public String addWarehouseItem(ModelMap model, @ModelAttribute("param") @Valid WarehouseItem item) {
        WarehouseEntity entity = new WarehouseEntity();
        entity.setItemName(item.getItemName());
        entity.setItemName(item.getQuantity());
        WarehouseEntityPK pk = new WarehouseEntityPK();
        pk.setItemId(10000);
        entity.setWarehouseEntityPK(pk);
        entity.setCreatedDate(new Date());
        entity.setUpdateDate(new Date());
        warehouseDao.save(entity);

        return "warehouse";
    }

}