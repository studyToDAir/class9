const {chromium} = require('playwright')

test()
async function test(){
    const broswer = await chromium.launch({
        headless: false
    })

    const ctx = await broswer.newContext()
    const page = await ctx.newPage()
    await page.goto("https://naver.com")

    await page.waitForSelector("#query")
    await page.fill('#query', '천안 맛집')
    await page.click('#search-btn')
    await page.waitForSelector("#place-app-root")
    await page.waitForTimeout(500)
    await page.screenshot({
        path: 'a.png',
        full_page: true
    })
    broswer.close()
} 