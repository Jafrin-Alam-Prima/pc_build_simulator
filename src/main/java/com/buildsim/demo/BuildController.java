package com.buildsim.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("buildAttributes")
public class BuildController {

    @GetMapping("/build")
    public String build(Model model, SessionStatus sessionStatus) {
        BuildAttributes buildAttributes = (BuildAttributes) model.getAttribute("buildAttributes");

        if (buildAttributes != null) {
            model.addAttribute("monitorBrand", buildAttributes.getMonitorBrand());
            model.addAttribute("processorBrand", buildAttributes.getProcessorBrand());
            model.addAttribute("motherboardBrand", buildAttributes.getMotherboardBrand());
            model.addAttribute("ramBrand", buildAttributes.getRamBrand());
            model.addAttribute("hddBrand", buildAttributes.getHddBrand());

            sessionStatus.setComplete();
        }

        return "build";
    }

    @PostMapping("/updateAttributes")
    public ModelAndView updateAttributes(@RequestParam("budget") int budget, Model model) {
        BuildAttributes buildAttributes = new BuildAttributes();

        if (budget >= 0 && budget <= 40000) {
            buildAttributes.setMonitorBrand("Walton");
            buildAttributes.setProcessorBrand("Intel i3");
            buildAttributes.setMotherboardBrand("Colorful");
            buildAttributes.setRamBrand("Team");
            buildAttributes.setHddBrand("Kingstone");
            
        } else if (budget > 40000 && budget <= 80000) {
            buildAttributes.setMonitorBrand("LG");
            buildAttributes.setProcessorBrand("Intel i5");
            buildAttributes.setMotherboardBrand("Gigabyte");
            buildAttributes.setRamBrand("G-skrill");
            buildAttributes.setHddBrand("Toshiba");
            
        } else {
            buildAttributes.setMonitorBrand("MSI");
            buildAttributes.setProcessorBrand("Intel i9");
            buildAttributes.setMotherboardBrand("Asus");
            buildAttributes.setRamBrand("Corsair");
            buildAttributes.setHddBrand("Seagate");
        }

        model.addAttribute("buildAttributes", buildAttributes);

        return new ModelAndView("redirect:/build");
    }
}
