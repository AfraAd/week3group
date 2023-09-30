# week3group
Exploring API Submission 

## Project Domain Ideas
**Recipe Organizer**
- input ingredients and produce the possible menu options
- choose the cuisine types, meal types, and dish types to proceed with.
- set a limit or range on the calories, and time, and specify exclusions to find the appropriate dishes.
- specify the level of certain nutrients to accommodate for more detailed dietary requirements. 
- interact with the organizer to store, and organize different recipes, and set up a timer when actually cooking

**Nutrition Analysis**
- input the recipe name or ingredient list and produce the relevant suggested nutritional values. 
- input the weight/number of servings to generate detailed values.
- generate the specific nutrition values for protein, sugar, vitamins, micro-elements, etc.
- add up the total dishes and servings to the final sum.

## High Level Description
Our application will be a recipe browser that also provides nutritional data for specific ingredients and recipes.

## API Documentation
**API**: (https://api.edamam.com/api/recipes/v2)

**Site with our API info**: (https://developer.edamam.com/edamam-docs-recipe-api)

## Screenshot of using Postman to interact with the API

<img width="958" alt="image" src="https://github.com/AfraAd/week3group/assets/128275390/c069ba18-d560-4997-8201-0e02671206b0">

## Example of output when we send our request

Note the response on the requests differs for each request. This is an example of a possible recipe in our response

```json
{"recipe":{"uri":"http://www.edamam.com/ontologies/edamam.owl#recipe_8275bb28647abcedef0baaf2dcf34f8b","label":"Chicken Paprikash",
  "image":"https://edamam-product-images.s3.amazonaws.com/web-img/e12/e12b8c5581226d7639168f41d126f2ff.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOb%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIBfLBEaVHPC%2F4jwpUpM0NbAAEbAFV8lKU25M6vvuf9dxAiBcLPhVr790h%2F8Yvi%2Fh4JryYDXaFz9xMlkJZk4qMOMLYSrCBQjf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDE4NzAxNzE1MDk4NiIMmSNgOV7E%2Beppwb8RKpYFp%2B4XpmwgRvIo%2BPSkoBn7vwm3GP%2FNaXg2UnAm54eeeHuv70FolgvUcKXhLXmYgjsLT%2F0bc9r%2FRPOfZFkehkTjfFeec%2BoTd%2BKic5lz81fb%2FLIKos6AO5Nx2VA2Kl1vLHZriQ7myTHgxwBDrd1aOJKysWolwA91P1%2BZwt7ZSkJ%2BpGcAHGtIgI6V2Md6OcvzjO5Y%2BTg%2BNb6M0g9gSw0Y%2FBYnHVMCKQr9eFcKYn1H6hL%2FaYypD%2BvS6%2FwX6PKBHhBjsAyEug4p8J%2FYXjK0TKsNK63sVBYkHiXyR0J5xcR%2FkQoVDD%2Fxzkb8pM7VxNNV%2BKZ19WuznheMOk2eR03iYajHhPRCW9YVrQDkXgpPbZrTaap92lYEGdpP9lhuH2%2BUPsM5xcwYGK98cGZN%2F9toNugZ7VJLV2UKspzw%2Bs5SPH0sdS%2FeLIO5A2u3OINBYh0mimEJ7N8OBoCqIoDWRjI1tZKxv4%2BCYJmdQdJK8DViQBvS4RVWh3JqAMbDEbFTE522uH%2BNWmVHLbTpHA4Zpn%2FnZ%2FjRN864ny5XaWAIZvqV939a5G0myDw3tlUkUfc5NP9Cl4zTFNnKKaiLvx%2BeVkhVazGk56wU%2Fxd5N27Hl7LLooecEJBy6wTowmAmbgfIyQioJ04%2FDy9cw8oZCU%2BGutNl9ZLUB3SxOTmqMZLzT1nOjAFAu%2FLCtMuXTI9F%2B%2BlywC8pprA51ISppoTjxbuHA51ZSsj36WgCSjceaQArzTuUdswSgSega2PKo9tyJqsNEch%2Fazfwazs5qrqANwltwL8uVTlHOCbeazkUzQqZqw%2Bw84WEAM5TIZcS%2BAUFBUxg%2FabA7EyRgeAsCZxwBt%2FVADdco%2FM%2F1mlLYUKQRe88EkQaPuw2ptCrqe%2B7G6AZ8pcwmqviqAY6sgHXlyjZA3EFyKLTFaX36gBrMWTlyxbwxN7qnZADuUj8zkTJcvDzSE%2BCxMkNr3D7UMZ85FWBpklHABNj0incCC7SIq2wNVfnvUGIq6kzb4Jma6yTWWkQX%2FgZ5%2F7VNDL1gThPE7k9LPHTefmftlRtXngti3OzI4pradaoIqwOPIolAaOS6J0yYaYtmIAq6N4kCPrOIZtsr2mVsgBITNEyGsc7P4cKnAP%2FdjAozecr7Cqyvt%2Fx&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230930T223136Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFCFI5BOVH%2F20230930%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=2e8d6eb3de5042313e30f72a287e77eccd5bbcca416f28f78021660a1fb88337",
  "images":{"THUMBNAIL":{"url":"https://edamam-product-images.s3.amazonaws.com/web-img/e12/e12b8c5581226d7639168f41d126f2ff-s.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOb%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIBfLBEaVHPC%2F4jwpUpM0NbAAEbAFV8lKU25M6vvuf9dxAiBcLPhVr790h%2F8Yvi%2Fh4JryYDXaFz9xMlkJZk4qMOMLYSrCBQjf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDE4NzAxNzE1MDk4NiIMmSNgOV7E%2Beppwb8RKpYFp%2B4XpmwgRvIo%2BPSkoBn7vwm3GP%2FNaXg2UnAm54eeeHuv70FolgvUcKXhLXmYgjsLT%2F0bc9r%2FRPOfZFkehkTjfFeec%2BoTd%2BKic5lz81fb%2FLIKos6AO5Nx2VA2Kl1vLHZriQ7myTHgxwBDrd1aOJKysWolwA91P1%2BZwt7ZSkJ%2BpGcAHGtIgI6V2Md6OcvzjO5Y%2BTg%2BNb6M0g9gSw0Y%2FBYnHVMCKQr9eFcKYn1H6hL%2FaYypD%2BvS6%2FwX6PKBHhBjsAyEug4p8J%2FYXjK0TKsNK63sVBYkHiXyR0J5xcR%2FkQoVDD%2Fxzkb8pM7VxNNV%2BKZ19WuznheMOk2eR03iYajHhPRCW9YVrQDkXgpPbZrTaap92lYEGdpP9lhuH2%2BUPsM5xcwYGK98cGZN%2F9toNugZ7VJLV2UKspzw%2Bs5SPH0sdS%2FeLIO5A2u3OINBYh0mimEJ7N8OBoCqIoDWRjI1tZKxv4%2BCYJmdQdJK8DViQBvS4RVWh3JqAMbDEbFTE522uH%2BNWmVHLbTpHA4Zpn%2FnZ%2FjRN864ny5XaWAIZvqV939a5G0myDw3tlUkUfc5NP9Cl4zTFNnKKaiLvx%2BeVkhVazGk56wU%2Fxd5N27Hl7LLooecEJBy6wTowmAmbgfIyQioJ04%2FDy9cw8oZCU%2BGutNl9ZLUB3SxOTmqMZLzT1nOjAFAu%2FLCtMuXTI9F%2B%2BlywC8pprA51ISppoTjxbuHA51ZSsj36WgCSjceaQArzTuUdswSgSega2PKo9tyJqsNEch%2Fazfwazs5qrqANwltwL8uVTlHOCbeazkUzQqZqw%2Bw84WEAM5TIZcS%2BAUFBUxg%2FabA7EyRgeAsCZxwBt%2FVADdco%2FM%2F1mlLYUKQRe88EkQaPuw2ptCrqe%2B7G6AZ8pcwmqviqAY6sgHXlyjZA3EFyKLTFaX36gBrMWTlyxbwxN7qnZADuUj8zkTJcvDzSE%2BCxMkNr3D7UMZ85FWBpklHABNj0incCC7SIq2wNVfnvUGIq6kzb4Jma6yTWWkQX%2FgZ5%2F7VNDL1gThPE7k9LPHTefmftlRtXngti3OzI4pradaoIqwOPIolAaOS6J0yYaYtmIAq6N4kCPrOIZtsr2mVsgBITNEyGsc7P4cKnAP%2FdjAozecr7Cqyvt%2Fx&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230930T223136Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFCFI5BOVH%2F20230930%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=82c374d44a3435e78aee1404768b4260bba2ba7e73d37d32612c9f0825907ca9",
    "width":100,"height":100},"SMALL":{"url":"https://edamam-product-images.s3.amazonaws.com/web-img/e12/e12b8c5581226d7639168f41d126f2ff-m.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOb%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIBfLBEaVHPC%2F4jwpUpM0NbAAEbAFV8lKU25M6vvuf9dxAiBcLPhVr790h%2F8Yvi%2Fh4JryYDXaFz9xMlkJZk4qMOMLYSrCBQjf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDE4NzAxNzE1MDk4NiIMmSNgOV7E%2Beppwb8RKpYFp%2B4XpmwgRvIo%2BPSkoBn7vwm3GP%2FNaXg2UnAm54eeeHuv70FolgvUcKXhLXmYgjsLT%2F0bc9r%2FRPOfZFkehkTjfFeec%2BoTd%2BKic5lz81fb%2FLIKos6AO5Nx2VA2Kl1vLHZriQ7myTHgxwBDrd1aOJKysWolwA91P1%2BZwt7ZSkJ%2BpGcAHGtIgI6V2Md6OcvzjO5Y%2BTg%2BNb6M0g9gSw0Y%2FBYnHVMCKQr9eFcKYn1H6hL%2FaYypD%2BvS6%2FwX6PKBHhBjsAyEug4p8J%2FYXjK0TKsNK63sVBYkHiXyR0J5xcR%2FkQoVDD%2Fxzkb8pM7VxNNV%2BKZ19WuznheMOk2eR03iYajHhPRCW9YVrQDkXgpPbZrTaap92lYEGdpP9lhuH2%2BUPsM5xcwYGK98cGZN%2F9toNugZ7VJLV2UKspzw%2Bs5SPH0sdS%2FeLIO5A2u3OINBYh0mimEJ7N8OBoCqIoDWRjI1tZKxv4%2BCYJmdQdJK8DViQBvS4RVWh3JqAMbDEbFTE522uH%2BNWmVHLbTpHA4Zpn%2FnZ%2FjRN864ny5XaWAIZvqV939a5G0myDw3tlUkUfc5NP9Cl4zTFNnKKaiLvx%2BeVkhVazGk56wU%2Fxd5N27Hl7LLooecEJBy6wTowmAmbgfIyQioJ04%2FDy9cw8oZCU%2BGutNl9ZLUB3SxOTmqMZLzT1nOjAFAu%2FLCtMuXTI9F%2B%2BlywC8pprA51ISppoTjxbuHA51ZSsj36WgCSjceaQArzTuUdswSgSega2PKo9tyJqsNEch%2Fazfwazs5qrqANwltwL8uVTlHOCbeazkUzQqZqw%2Bw84WEAM5TIZcS%2BAUFBUxg%2FabA7EyRgeAsCZxwBt%2FVADdco%2FM%2F1mlLYUKQRe88EkQaPuw2ptCrqe%2B7G6AZ8pcwmqviqAY6sgHXlyjZA3EFyKLTFaX36gBrMWTlyxbwxN7qnZADuUj8zkTJcvDzSE%2BCxMkNr3D7UMZ85FWBpklHABNj0incCC7SIq2wNVfnvUGIq6kzb4Jma6yTWWkQX%2FgZ5%2F7VNDL1gThPE7k9LPHTefmftlRtXngti3OzI4pradaoIqwOPIolAaOS6J0yYaYtmIAq6N4kCPrOIZtsr2mVsgBITNEyGsc7P4cKnAP%2FdjAozecr7Cqyvt%2Fx&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230930T223136Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFCFI5BOVH%2F20230930%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=308b03d0473f24a35a3675fa1aa627e7380421ff43f2728ec7edd533a22e2811",
    "width":200,"height":200},"REGULAR":{"url":"https://edamam-product-images.s3.amazonaws.com/web-img/e12/e12b8c5581226d7639168f41d126f2ff.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOb%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIBfLBEaVHPC%2F4jwpUpM0NbAAEbAFV8lKU25M6vvuf9dxAiBcLPhVr790h%2F8Yvi%2Fh4JryYDXaFz9xMlkJZk4qMOMLYSrCBQjf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDE4NzAxNzE1MDk4NiIMmSNgOV7E%2Beppwb8RKpYFp%2B4XpmwgRvIo%2BPSkoBn7vwm3GP%2FNaXg2UnAm54eeeHuv70FolgvUcKXhLXmYgjsLT%2F0bc9r%2FRPOfZFkehkTjfFeec%2BoTd%2BKic5lz81fb%2FLIKos6AO5Nx2VA2Kl1vLHZriQ7myTHgxwBDrd1aOJKysWolwA91P1%2BZwt7ZSkJ%2BpGcAHGtIgI6V2Md6OcvzjO5Y%2BTg%2BNb6M0g9gSw0Y%2FBYnHVMCKQr9eFcKYn1H6hL%2FaYypD%2BvS6%2FwX6PKBHhBjsAyEug4p8J%2FYXjK0TKsNK63sVBYkHiXyR0J5xcR%2FkQoVDD%2Fxzkb8pM7VxNNV%2BKZ19WuznheMOk2eR03iYajHhPRCW9YVrQDkXgpPbZrTaap92lYEGdpP9lhuH2%2BUPsM5xcwYGK98cGZN%2F9toNugZ7VJLV2UKspzw%2Bs5SPH0sdS%2FeLIO5A2u3OINBYh0mimEJ7N8OBoCqIoDWRjI1tZKxv4%2BCYJmdQdJK8DViQBvS4RVWh3JqAMbDEbFTE522uH%2BNWmVHLbTpHA4Zpn%2FnZ%2FjRN864ny5XaWAIZvqV939a5G0myDw3tlUkUfc5NP9Cl4zTFNnKKaiLvx%2BeVkhVazGk56wU%2Fxd5N27Hl7LLooecEJBy6wTowmAmbgfIyQioJ04%2FDy9cw8oZCU%2BGutNl9ZLUB3SxOTmqMZLzT1nOjAFAu%2FLCtMuXTI9F%2B%2BlywC8pprA51ISppoTjxbuHA51ZSsj36WgCSjceaQArzTuUdswSgSega2PKo9tyJqsNEch%2Fazfwazs5qrqANwltwL8uVTlHOCbeazkUzQqZqw%2Bw84WEAM5TIZcS%2BAUFBUxg%2FabA7EyRgeAsCZxwBt%2FVADdco%2FM%2F1mlLYUKQRe88EkQaPuw2ptCrqe%2B7G6AZ8pcwmqviqAY6sgHXlyjZA3EFyKLTFaX36gBrMWTlyxbwxN7qnZADuUj8zkTJcvDzSE%2BCxMkNr3D7UMZ85FWBpklHABNj0incCC7SIq2wNVfnvUGIq6kzb4Jma6yTWWkQX%2FgZ5%2F7VNDL1gThPE7k9LPHTefmftlRtXngti3OzI4pradaoIqwOPIolAaOS6J0yYaYtmIAq6N4kCPrOIZtsr2mVsgBITNEyGsc7P4cKnAP%2FdjAozecr7Cqyvt%2Fx&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230930T223136Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFCFI5BOVH%2F20230930%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=2e8d6eb3de5042313e30f72a287e77eccd5bbcca416f28f78021660a1fb88337",
    "width":300,"height":300},"LARGE":{"url":"https://edamam-product-images.s3.amazonaws.com/web-img/e12/e12b8c5581226d7639168f41d126f2ff-l.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOb%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIBfLBEaVHPC%2F4jwpUpM0NbAAEbAFV8lKU25M6vvuf9dxAiBcLPhVr790h%2F8Yvi%2Fh4JryYDXaFz9xMlkJZk4qMOMLYSrCBQjf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDE4NzAxNzE1MDk4NiIMmSNgOV7E%2Beppwb8RKpYFp%2B4XpmwgRvIo%2BPSkoBn7vwm3GP%2FNaXg2UnAm54eeeHuv70FolgvUcKXhLXmYgjsLT%2F0bc9r%2FRPOfZFkehkTjfFeec%2BoTd%2BKic5lz81fb%2FLIKos6AO5Nx2VA2Kl1vLHZriQ7myTHgxwBDrd1aOJKysWolwA91P1%2BZwt7ZSkJ%2BpGcAHGtIgI6V2Md6OcvzjO5Y%2BTg%2BNb6M0g9gSw0Y%2FBYnHVMCKQr9eFcKYn1H6hL%2FaYypD%2BvS6%2FwX6PKBHhBjsAyEug4p8J%2FYXjK0TKsNK63sVBYkHiXyR0J5xcR%2FkQoVDD%2Fxzkb8pM7VxNNV%2BKZ19WuznheMOk2eR03iYajHhPRCW9YVrQDkXgpPbZrTaap92lYEGdpP9lhuH2%2BUPsM5xcwYGK98cGZN%2F9toNugZ7VJLV2UKspzw%2Bs5SPH0sdS%2FeLIO5A2u3OINBYh0mimEJ7N8OBoCqIoDWRjI1tZKxv4%2BCYJmdQdJK8DViQBvS4RVWh3JqAMbDEbFTE522uH%2BNWmVHLbTpHA4Zpn%2FnZ%2FjRN864ny5XaWAIZvqV939a5G0myDw3tlUkUfc5NP9Cl4zTFNnKKaiLvx%2BeVkhVazGk56wU%2Fxd5N27Hl7LLooecEJBy6wTowmAmbgfIyQioJ04%2FDy9cw8oZCU%2BGutNl9ZLUB3SxOTmqMZLzT1nOjAFAu%2FLCtMuXTI9F%2B%2BlywC8pprA51ISppoTjxbuHA51ZSsj36WgCSjceaQArzTuUdswSgSega2PKo9tyJqsNEch%2Fazfwazs5qrqANwltwL8uVTlHOCbeazkUzQqZqw%2Bw84WEAM5TIZcS%2BAUFBUxg%2FabA7EyRgeAsCZxwBt%2FVADdco%2FM%2F1mlLYUKQRe88EkQaPuw2ptCrqe%2B7G6AZ8pcwmqviqAY6sgHXlyjZA3EFyKLTFaX36gBrMWTlyxbwxN7qnZADuUj8zkTJcvDzSE%2BCxMkNr3D7UMZ85FWBpklHABNj0incCC7SIq2wNVfnvUGIq6kzb4Jma6yTWWkQX%2FgZ5%2F7VNDL1gThPE7k9LPHTefmftlRtXngti3OzI4pradaoIqwOPIolAaOS6J0yYaYtmIAq6N4kCPrOIZtsr2mVsgBITNEyGsc7P4cKnAP%2FdjAozecr7Cqyvt%2Fx&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20230930T223136Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3600&X-Amz-Credential=ASIASXCYXIIFCFI5BOVH%2F20230930%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=4d4fe1e97fc1f56642cdfa1b6b02a76303bdfcd13621591243549d5c562231d0",
    "width":600,"height":600}},"source":"No Recipes","url":"http://norecipes.com/recipe/chicken-paprikash/","shareAs":"http://www.edamam.com/recipe/chicken-paprikash-8275bb28647abcedef0baaf2dcf34f8b/chicken",
  "yield":4.0,"dietLabels":["Low-Carb"],"healthLabels":["Egg-Free","Peanut-Free","Tree-Nut-Free","Soy-Free","Fish-Free"
  ,"Shellfish-Free","Pork-Free","Red-Meat-Free","Crustacean-Free","Celery-Free","Mustard-Free","Sesame-Free","Lupine-Free",
    "Mollusk-Free","Alcohol-Free","Sulfite-Free"],"cautions":["Sulfites"],
  "ingredientLines":["640 grams chicken - drumsticks and thighs ( 3 whole chicken legs cut apart)","1/2 teaspoon salt",
    "1/4 teaspoon black pepper","1 tablespoon butter – cultured unsalted (or olive oil)","240 grams onion sliced thin (1 large onion)",
    "70 grams Anaheim pepper chopped (1 large pepper)","25 grams paprika (about 1/4 cup)","1 cup chicken stock","1/2 teaspoon salt",
    "1/2 cup sour cream","1 tablespoon flour – all-purpose"],
  "ingredients":[{"text":"640 grams chicken - drumsticks and thighs ( 3 whole chicken legs cut apart)","quantity":640.0,
    "measure":"gram","food":"chicken - drumsticks","weight":640.0,"foodCategory":"Poultry","foodId":"food_agzvc6lbxg03stab195szars32lx",
    "image":"https://www.edamam.com/food-img/491/4916353c22bd1ac381ac81d55597ddbe.jpg"},
    {"text":"640 grams chicken - drumsticks and thighs ( 3 whole chicken legs cut apart)","quantity":640.0,"measure":"gram","food":"thighs",
      "weight":640.0,"foodCategory":"Poultry","foodId":"food_bsarl08be0gwarb34bpviafna9d4",
      "image":"https://www.edamam.com/food-img/007/00792642367e1f55de680762f85cfb3b.jpg"},{"text":"1/2 teaspoon salt",
      "quantity":0.5,"measure":"teaspoon","food":"salt","weight":3.0,"foodCategory":"Condiments and sauces",
      "foodId":"food_btxz81db72hwbra2pncvebzzzum9","image":"https://www.edamam.com/food-img/694/6943ea510918c6025795e8dc6e6eaaeb.jpg"},
    {"text":"1/4 teaspoon black pepper","quantity":0.25,"measure":"teaspoon","food":"black pepper","weight":0.725,
      "foodCategory":"Condiments and sauces","foodId":"food_b6ywzluaaxv02wad7s1r9ag4py89",
      "image":"https://www.edamam.com/food-img/c6e/c6e5c3bd8d3bc15175d9766971a4d1b2.jpg"},
    {"text":"1 tablespoon butter – cultured unsalted (or olive oil)","quantity":1.0,"measure":"tablespoon","food":"olive oil",
      "weight":13.5,"foodCategory":"Oils","foodId":"food_b1d1icuad3iktrbqby0hiagafaz7",
      "image":"https://www.edamam.com/food-img/4d6/4d651eaa8a353647746290c7a9b29d84.jpg"},{"text":"240 grams onion sliced thin (1 large onion)",
      "quantity":1.0,"measure":"onion","food":"onion","weight":78.125,"foodCategory":"vegetables",
      "foodId":"food_bmrvi4ob4binw9a5m7l07amlfcoy","image":"https://www.edamam.com/food-img/205/205e6bf2399b85d34741892ef91cc603.jpg"},
    {"text":"70 grams Anaheim pepper chopped (1 large pepper)","quantity":1.0,"measure":"pepper","food":"Anaheim pepper",
      "weight":56.25,"foodCategory":"vegetables","foodId":"food_bv2gevdbd1orbiarnp1vfaez1r85","image":"https://www.edamam.com/food-img/73f/73ff2eeb21372fe15b0ec51f9ecf368d.jpeg",
    },{"text":"25 grams paprika (about 1/4 cup)","quantity":0.25,"measure":"cup","food":"paprika","weight":27.200000000459866,
      "foodCategory":"Condiments and sauces","foodId":"food_a9dpcnjb883g67b3lq82ca0421ql","image":"https://www.edamam.com/food-img/474/474d63763b9d8b9da98c5f43a114648c.jpg",
    },{"text":"1 cup chicken stock","quantity":1.0,"measure":"cup","food":"chicken stock","weight":240.0,"foodCategory":"canned soup",
      "foodId":"food_bptblvzambd16nbhewqmhaw1rnh5","image":"https://www.edamam.com/food-img/26a/26a10c4cb4e07bab54d8a687ef5ac7d8.jpg"},
    {"text":"1/2 teaspoon salt","quantity":0.5,"measure":"teaspoon","food":"salt","weight":3.0,"foodCategory":"Condiments and sauces",
      "foodId":"food_btxz81db72hwbra2pncvebzzzum9","image":"https://www.edamam.com/food-img/694/6943ea510918c6025795e8dc6e6eaaeb.jpg"},
    {"text":"1/2 cup sour cream","quantity":0.5,"measure":"cup","food":"sour cream","weight":115.0,"foodCategory":"Dairy",
      "foodId":"food_adp9fcubzl3lr7bcvzn3rbfiiiwq","image":"https://www.edamam.com/food-img/f9d/f9d6183267b041b0aff9a10b89c9c15f.jpg"},
    {"text":"1 tablespoon flour – all-purpose","quantity":1.0,"measure":"tablespoon","food":"flour","weight":7.8124999998679145,
      "foodCategory":"grains","foodId":"food_ahebfs0a985an4aubqaebbipra58",
      "image":"https://www.edamam.com/food-img/b4c/b4c739e76a6f2172b7ad49d0aa41d5aa.jpg"}],"calories":3038.9512500008163,
  "totalCO2Emissions":18229.710273409637,"co2EmissionsClass":"G","totalWeight":1824.6125000003276,"totalTime":0.0,
  "cuisineType":["central europe"],"mealType":["lunch/dinner"],"dishType":["main course"],"totalNutrients":{"ENERC_KCAL":{"label":"Energy",
    "quantity":3038.9512500008163,"unit":"kcal"},"FAT":{"label":"Fat","quantity":207.60962250005807,"unit":"g"},"FASAT":{"label":"Saturated",
    "quantity":59.56929187500963,"unit":"g"},"FATRN":{"label":"Trans","quantity":1.7602000000000002,"unit":"g"},"FAMS":{"label":"Monounsaturated",
    "quantity":85.24519837500769,"unit":"g"},"FAPU":{"label":"Polyunsaturated","quantity":39.828234875035186,"unit":"g"},"CHOCDF":{"label":"Carbs",
    "quantity":49.83156250014755,"unit":"g"},"CHOCDF.net":{"label":"Carbohydrates (net)","quantity":37.77252499999062,"unit":"g"},"FIBTG":
  {"label":"Fiber","quantity":12.059037500156926,"unit":"g"},"SUGAR":{"label":"Sugars","quantity":16.722083750047013,"unit":"g"},"PROCNT":{"label":"Protein",
    "quantity":236.99366250005127,"unit":"g"},"CHOLE":{"label":"Cholesterol","quantity":1291.05,"unit":"mg"},"NA":{"label":"Sodium",
    "quantity":3929.77975000031,"unit":"mg"},"CA":{"label":"Calcium","quantity":315.69037500103326,"unit":"mg"},
    "MG":{"label":"Magnesium","quantity":324.8095000007895,"unit":"mg"},"K":{"label":"Potassium","quantity":3995.8393750103432,"unit":"mg"},
    "FE":{"label":"Iron","quantity":16.315966250095485,"unit":"mg"},"ZN":{"label":"Zinc","quantity":22.42413750001899,"unit":"mg"},
    "P":{"label":"Phosphorus","quantity":2343.7222500013017,"unit":"mg"},"VITA_RAE":{"label":"Vitamin A","quantity":1084.3032500113127,"unit":"µg"},
    "VITC":{"label":"Vitamin C","quantity":143.66605000000413,"unit":"mg"},"THIA":{"label":"Thiamin (B1)","quantity":1.291880500001359,"unit":"mg"},
    "RIBF":{"label":"Riboflavin (B2)","quantity":2.983908750005604,"unit":"mg"},"NIA":{"label":"Niacin (B3)","quantity":67.92107125004479,"unit":"mg"},
    "VITB6A":{"label":"Vitamin B6","quantity":5.460102250009783,"unit":"mg"},"FOLDFE":{"label":"Folate equivalent (total)","quantity":100.56375000019099,
      "unit":"µg"},"FOLFD":{"label":"Folate (food)","quantity":100.56375000019099,"unit":"µg"},"FOLAC":{"label":"Folic acid","quantity":0.0,"unit":"µg"},
    "VITB12":{"label":"Vitamin B12","quantity":7.601500000000001,"unit":"µg"},"VITD":{"label":"Vitamin D","quantity":1.2800000000000002,"unit":"µg"},
    "TOCPHA":{"label":"Vitamin E","quantity":13.34417750013374,"unit":"mg"},"VITK1":{"label":"Vitamin K","quantity":71.18228750036887,"unit":"µg"},
    "WATER":{"label":"Water","quantity":1317.964337500036,"unit":"g"}},"totalDaily":{"ENERC_KCAL":{"label":"Energy","quantity":151.94756250004082,
    "unit":"%"},"FAT":{"label":"Fat","quantity":319.39941923085854,"unit":"%"},"FASAT":{"label":"Saturated","quantity":297.84645937504814,"unit":"%"},
    "CHOCDF":{"label":"Carbs","quantity":16.610520833382516,"unit":"%"},"FIBTG":{"label":"Fiber","quantity":48.2361500006277,"unit":"%"},
    "PROCNT":{"label":"Protein","quantity":473.9873250001026,"unit":"%"},"CHOLE":{"label":"Cholesterol","quantity":430.35,"unit":"%"},
    "NA":{"label":"Sodium","quantity":163.74082291667958,"unit":"%"},"CA":{"label":"Calcium","quantity":31.569037500103324,"unit":"%"},
    "MG":{"label":"Magnesium","quantity":77.33559523828322,"unit":"%"},"K":{"label":"Potassium","quantity":85.01785904277327,"unit":"%"},
    "FE":{"label":"Iron","quantity":90.64425694497491,"unit":"%"},"ZN":{"label":"Zinc","quantity":203.8557954547181,"unit":"%"},
    "P":{"label":"Phosphorus","quantity":334.81746428590026,"unit":"%"},"VITA_RAE":{"label":"Vitamin A","quantity":120.47813889014584,"unit":"%"},
    "VITC":{"label":"Vitamin C","quantity":159.62894444444905,"unit":"%"},"THIA":{"label":"Thiamin (B1)","quantity":107.65670833344657,"unit":"%"},
    "RIBF":{"label":"Riboflavin (B2)","quantity":229.5314423081234,"unit":"%"},"NIA":{"label":"Niacin (B3)","quantity":424.5066953127799,"unit":"%"},
    "VITB6A":{"label":"Vitamin B6","quantity":420.0078653853679,"unit":"%"},"FOLDFE":{"label":"Folate equivalent (total)","quantity":25.140937500047748,
      "unit":"%"},"VITB12":{"label":"Vitamin B12","quantity":316.72916666666674,"unit":"%"},"VITD":{"label":"Vitamin D","quantity":8.533333333333335,
      "unit":"%"},"TOCPHA":{"label":"Vitamin E","quantity":88.96118333422494,"unit":"%"},"VITK1":{"label":"Vitamin K","quantity":59.31857291697406,
      "unit":"%"}},"digest":[{"label":"Fat","tag":"FAT","schemaOrgTag":"fatContent","total":207.60962250005807,"hasRDI":true,"daily":319.39941923085854,
    "unit":"g","sub":[{"label":"Saturated","tag":"FASAT","schemaOrgTag":"saturatedFatContent","total":59.56929187500963,"hasRDI":true,
      "daily":297.84645937504814,"unit":"g"},{"label":"Trans","tag":"FATRN","schemaOrgTag":"transFatContent","total":1.7602000000000002,
      "hasRDI":false,"daily":0.0,"unit":"g"},{"label":"Monounsaturated","tag":"FAMS","schemaOrgTag":null,"total":85.24519837500769,"hasRDI":false,
      "daily":0.0,"unit":"g"},{"label":"Polyunsaturated","tag":"FAPU","schemaOrgTag":null,"total":39.828234875035186,"hasRDI":false,"daily":0.0,
      "unit":"g"}]},{"label":"Carbs","tag":"CHOCDF","schemaOrgTag":"carbohydrateContent","total":49.83156250014755,"hasRDI":true,
    "daily":16.610520833382516,"unit":"g","sub":[{"label":"Carbs (net)","tag":"CHOCDF.net","schemaOrgTag":null,"total":37.77252499999062,
      "hasRDI":false,"daily":0.0,"unit":"g"},{"label":"Fiber","tag":"FIBTG","schemaOrgTag":"fiberContent","total":12.059037500156926,"hasRDI":true,
      "daily":48.2361500006277,"unit":"g"},{"label":"Sugars","tag":"SUGAR","schemaOrgTag":"sugarContent","total":16.722083750047013,"hasRDI":false,
      "daily":0.0,"unit":"g"},{"label":"Sugars, added","tag":"SUGAR.added","schemaOrgTag":null,"total":0.0,"hasRDI":false,"daily":0.0,"unit":"g"}]},
    {"label":"Protein","tag":"PROCNT","schemaOrgTag":"proteinContent","total":236.99366250005127,"hasRDI":true,"daily":473.9873250001026,"unit":"g"},
    {"label":"Cholesterol","tag":"CHOLE","schemaOrgTag":"cholesterolContent","total":1291.05,"hasRDI":true,"daily":430.35,"unit":"mg"},
    {"label":"Sodium","tag":"NA","schemaOrgTag":"sodiumContent","total":3929.77975000031,"hasRDI":true,"daily":163.74082291667958,"unit":"mg"},
    {"label":"Calcium","tag":"CA","schemaOrgTag":null,"total":315.69037500103326,"hasRDI":true,"daily":31.569037500103324,"unit":"mg"},
    {"label":"Magnesium","tag":"MG","schemaOrgTag":null,"total":324.8095000007895,"hasRDI":true,"daily":77.33559523828322,"unit":"mg"},
    {"label":"Potassium","tag":"K","schemaOrgTag":null,"total":3995.8393750103432,"hasRDI":true,"daily":85.01785904277327,"unit":"mg"},
    {"label":"Iron","tag":"FE","schemaOrgTag":null,"total":16.315966250095485,"hasRDI":true,"daily":90.64425694497491,"unit":"mg"},{"label":"Zinc",
      "tag":"ZN","schemaOrgTag":null,"total":22.42413750001899,"hasRDI":true,"daily":203.8557954547181,"unit":"mg"},{"label":"Phosphorus","tag":"P",
      "schemaOrgTag":null,"total":2343.7222500013017,"hasRDI":true,"daily":334.81746428590026,"unit":"mg"},{"label":"Vitamin A","tag":"VITA_RAE",
      "schemaOrgTag":null,"total":1084.3032500113127,"hasRDI":true,"daily":120.47813889014584,"unit":"µg"},{"label":"Vitamin C","tag":"VITC",
      "schemaOrgTag":null,"total":143.66605000000413,"hasRDI":true,"daily":159.62894444444905,"unit":"mg"},{"label":"Thiamin (B1)","tag":"THIA",
      "schemaOrgTag":null,"total":1.291880500001359,"hasRDI":true,"daily":107.65670833344657,"unit":"mg"},{"label":"Riboflavin (B2)","tag":"RIBF",
      "schemaOrgTag":null,"total":2.983908750005604,"hasRDI":true,"daily":229.5314423081234,"unit":"mg"},{"label":"Niacin (B3)","tag":"NIA",
      "schemaOrgTag":null,"total":67.92107125004479,"hasRDI":true,"daily":424.5066953127799,"unit":"mg"},{"label":"Vitamin B6","tag":"VITB6A"}
```

## Any technical problems blocking progress
N/A