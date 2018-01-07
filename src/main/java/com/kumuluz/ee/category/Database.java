/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.kumuluz.ee.category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    private static List<Category> categories = new ArrayList<>(
            Arrays.asList(
                    new Category("1", "Pohištvo", "Raznovrstni pohištveni kosi", false),
                    new Category("2", "Hrana", "Raznovrstna hrana in domači pridelki", false),
                    new Category("3", "Tehnologija", "Tehnološki pripomočki", false),
                    new Category("4", "Kemikalije - radioaktivne snovi", "Razne kemične snovi. Pozor: 3+", true),
                    new Category("99", "Ostalo", "Ostalo, kar ni pokrito v širokem naboru ostalih kategorij", false)
            )
    );



    public static List<Category> getCategories() {
        return categories;
    }

    public static Category getCategory(String id) {

        for (Category category : categories) {
            if (category.getId().equals(id))
                return category;
        }

        return null;
    }


    public static void addCategory(Category category) {
        categories.add(category);
    }

    public static void deleteCategory(String id) {
        for (Category category : categories) {
            if (category.getId().equals(id)) {
                categories.remove(category);
                break;
            }
        }
    }
}
