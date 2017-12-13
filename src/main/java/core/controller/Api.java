package core.controller;

import core.model.Category;
import core.model.Item;
import core.model.Manufacturer;
import core.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class Api {
    private MainService service;

    @Autowired
    public Api(MainService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getApiDoc() {
        return "tiles.api";
    }

    // ====================== GET ============================================

    @RequestMapping(value = {"/item", "/item/all"}, method = RequestMethod.GET)
    public @ResponseBody
    List getItemsAll() {
        return service.getAllItems();
    }

    @RequestMapping(value = "/item/{itemId}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity getItemsById(@PathVariable(value = "itemId") String id) {
        Object json = service.getItemById(id);
        if (json == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(json);
    }

    @RequestMapping(value = {"/manufacturer", "/manufacturer/all"}, method = RequestMethod.GET)
    public @ResponseBody
    List getManufacturersAll() {
        return service.getAllManufacturers();
    }

    @RequestMapping(value = "/manufacturer/{itemId}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity getManufacturersById(@PathVariable(value = "itemId") String id) {
        Object json = service.getManufacturerById(id);
        if (json == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(json);
    }

    @RequestMapping(value = {"/category", "/category/all"}, method = RequestMethod.GET)
    public @ResponseBody
    List getCategoriesAll() {
        return service.getAllCategories();
    }

    @RequestMapping(value = "/category/{itemId}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity getCategoriesById(@PathVariable(value = "itemId") String id) {
        Object json = service.getCategoryById(id);
        if (json == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(json);
    }

    // ====================== CREATE =========================================

    @RequestMapping(value = "/item/create", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity createItem(@RequestBody Item item) {
        String resp = service.createItem(item);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @RequestMapping(value = "/manufacturer/create", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity createManufacturer(@RequestBody Manufacturer manufacturer) {
        String resp = service.createManufacturer(manufacturer);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @RequestMapping(value = "/category/create", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity createCategory(@RequestBody Category category) {
        String resp = service.createCategory(category);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    // ====================== DELETE =========================================

    @RequestMapping(value = "/item/delete", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity deleteItem(@RequestBody Item item) {
        String resp = service.deleteItem(item);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @RequestMapping(value = "/item/delete/{itemId}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity deleteItemById(@PathVariable(value = "itemId") String id) {
        Object json = service.deleteItemById(id);
        if (json == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(json);
    }

    @RequestMapping(value = "/manufacturer/delete", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity deleteManufacturer(@RequestBody Manufacturer manufacturer) {
        String resp = service.deleteManufacturer(manufacturer);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @RequestMapping(value = "/manufacturer/delete/{manId}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity deleteManufacturerById(@PathVariable(value = "manId") String id) {
        Object json = service.deleteManufacturerById(id);
        if (json == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(json);
    }

    @RequestMapping(value = "/category/delete", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity deleteCategory(@RequestBody Category category) {
        String resp = service.deleteCategory(category);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @RequestMapping(value = "/category/delete/{catId}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity deleteCategoryById(@PathVariable(value = "catId") String id) {
        Object json = service.deleteCategoryById(id);
        if (json == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(json);
    }

    // ====================== UPDATE =========================================

    @RequestMapping(value = "/item/update", method = RequestMethod.PUT)
    public @ResponseBody
    ResponseEntity updateItem(@RequestBody Item item) {
        String resp = service.updateItem(item);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @RequestMapping(value = "/manufacturer/update", method = RequestMethod.PUT)
    public @ResponseBody
    ResponseEntity updateManufacturer(@RequestBody Manufacturer manufacturer) {
        String resp = service.updateManufacturer(manufacturer);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @RequestMapping(value = "/category/update", method = RequestMethod.PUT)
    public @ResponseBody
    ResponseEntity updateCategory(@RequestBody Category category) {
        String resp = service.updateCategory(category);
        if (resp.isEmpty()) {
            return ResponseEntity.ok(null);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }
}
